package apitiendavideo.apitiendavideo.modelos;

import java.sql.Date;

import javax.persistence.*;



@Entity
@Table(name = "alquiler")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idinventario", referencedColumnName = "id")
    private Inventario inventario;
    @ManyToOne
    @JoinColumn(name = "idtercero", referencedColumnName = "id")
    private Tercero tercero;
    @Column(name = "fechaPrestamo")
    private Date fechaPrestamo;
    @Column(name = "plazo")
    private Long plazo;
    @Column(name = "fechaDevolucion")
    private Date fechaDevolucion;
    @Column(name = "precio")
    private Float precio;

    public Alquiler(){}
    public Alquiler(Long id, Inventario inventario, Tercero tercero, Date fechaPrestamo, Long plazo,
            Date fechaDevolucion, Float precio) {
        this.id = id;
        this.inventario = inventario;
        this.tercero = tercero;
        this.fechaPrestamo = fechaPrestamo;
        this.plazo = plazo;
        this.fechaDevolucion = fechaDevolucion;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public Tercero getTercero() {
        return tercero;
    }

    public void setTercero(Tercero tercero) {
        this.tercero = tercero;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Long getPlazo() {
        return plazo;
    }

    public void setPlazo(Long plazo) {
        this.plazo = plazo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}
