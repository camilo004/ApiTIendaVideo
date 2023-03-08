package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tercero")
public class Tercero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "documento")
    private String documento;
    @ManyToOne
    @JoinColumn(name = "idtipodocumento", referencedColumnName = "id")
    private Tipodocumento tipodocumento;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "movil")
    private String movil;
    @Column(name = "correo")
    private String correo;
    @Column(name = "direccion")
    private String direccion;
    @ManyToOne
    @JoinColumn(name = "idciudad", referencedColumnName = "id")
    private Ciudad ciudad;

    public Tercero(){}

    public Tercero(Long id, String nombre, String documento, Tipodocumento tipodocumento, String telefono, String movil,
            String correo, String direccion, Ciudad ciudad ,TipoPersona tipoPersona) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.tipodocumento = tipodocumento;
        this.telefono = telefono;
        this.movil = movil;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.tipoPersona = tipoPersona;
    }

    @Column(name = "tipopersona")
    private TipoPersona tipoPersona;

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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Tipodocumento getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(Tipodocumento tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public boolean obligadoIva() {
        switch (this.tipoPersona) {
            case NATURAL:
                return false;
            case JURIDICA:
                return true;
            case PUBLICA:
                return false;
        }
        return false;
    }

}
