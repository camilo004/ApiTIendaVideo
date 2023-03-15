package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;

@Entity
@Table(name = "titulo")
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "año")
    private int anio;
    @Column(name = "protagonistas")
    private String protagonistas;
    @Column(name = "productor")
    private String productor;
    @Column(name = "director")
    private String director;
    @ManyToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "id")
    private Empresa empresa;
    @Column(name = "precio")
    private Float precio;

    public Titulo(){}


    public Titulo(Long id, String nombre, int anio, String protagonistas, String productor, String director,
            Empresa empresa, Float precio) {
        this.id = id;
        this.nombre = nombre;
        this.anio = anio;
        this.protagonistas = protagonistas;
        this.productor = productor;
        this.director = director;
        this.empresa = empresa;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

}
