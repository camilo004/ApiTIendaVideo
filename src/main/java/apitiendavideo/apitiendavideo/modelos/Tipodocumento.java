package apitiendavideo.apitiendavideo.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tipodocumento")
public class Tipodocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "ingles")
    private String ingles;
    @Column(name = "sigla")
    private String sigla;

    public Tipodocumento(){}

    public Tipodocumento(Long id, String tipo, String ingles, String sigla) {
        this.id = id;
        this.tipo = tipo;
        this.ingles = ingles;
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

}
