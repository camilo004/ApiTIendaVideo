package apitiendavideo.apitiendavideo.modelos;



import javax.persistence.*;

@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    @Column(name = "id")
    private Long id;
    @Column(name = "pais")
    private String pais;
    @Column(name = "codigoalfa2")
    private String codigoAlfa2;
    @Column(name = "codigoalfa3")
    private String codigoAlfa3;

    public Pais(){}

    public Pais(Long id, String pais, String codigoAlfa2, String codigoAlfa3) {
        this.id = id;
        this.pais = pais;
        this.codigoAlfa2 = codigoAlfa2;
        this.codigoAlfa3 = codigoAlfa3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoAlfa2() {
        return codigoAlfa2;
    }

    public void setCodigoAlfa2(String codigoAlfa2) {
        this.codigoAlfa2 = codigoAlfa2;
    }

    public String getCodigoAlfa3() {
        return codigoAlfa3;
    }

    public void setCodigoAlfa3(String codigoAlfa3) {
        this.codigoAlfa3 = codigoAlfa3;
    }

}
