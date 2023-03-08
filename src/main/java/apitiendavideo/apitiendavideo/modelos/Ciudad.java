package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;


@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "ciudad", nullable = true, length = 100)
    private String ciudad;
    @ManyToOne
    @JoinColumn(name = "idregion", referencedColumnName = "id")
    private Region region;

    public Ciudad(){}

    public Ciudad(long id, String ciudad, Region region) {
        this.id = id;
        this.ciudad = ciudad;
        this.region = region;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Region getRegion() {
        return region;
    }

    public void Region(Region region) {
        this.region = region;
    }

}
