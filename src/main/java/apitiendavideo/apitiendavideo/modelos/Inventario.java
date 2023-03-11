package apitiendavideo.apitiendavideo.modelos;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "idtitulo", referencedColumnName = "id")
    private Titulo titulo;
    @Column(name = "consecutivo")
    private long consecutivo;
    @ManyToOne
    @JoinColumn(name = "idtecnologia", referencedColumnName = "id")
    private Tecnologia tecnologia;
    @Column(name = "fechaadquisicion")
    private Date fechaAdquisicion;
    @Column(name = "activo")
    private Long activo;

    public Inventario(){}

    public Inventario(Long id, Titulo titulo, long consecutivo, Tecnologia tecnologia, Date fechaAdquisicion,
            Long activo) {
        this.id = id;
        this.titulo = titulo;
        this.consecutivo = consecutivo;
        this.tecnologia = tecnologia;
        this.fechaAdquisicion = fechaAdquisicion;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Long getActivo() {
        return activo;
    }

    public void setActivo(Long activo) {
        this.activo = activo;
    }

}
