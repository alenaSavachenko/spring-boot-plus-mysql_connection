package adsd.app.bouwapp.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="grondstoffen")
public class Grondstof {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    int id;
    @Column(name="soort")
    String soort;
    @Column(name="duurzaamheidsklasse")
    float duurzaamheidsklasse;
    @Column(name="dichtheid")
    int dichtheid;
    @Column(name="toepassingen")
    String toepassingen;

    // contructors

    public Grondstof(){};

    public Grondstof(String soort, float duurzaamheidsklasse, int dichtheid, String toepassingen) {
        this.soort = soort;
        this.duurzaamheidsklasse = duurzaamheidsklasse;
        this.dichtheid = dichtheid;
        this.toepassingen = toepassingen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public float getDuurzaamheidsklasse() {
        return duurzaamheidsklasse;
    }

    public void setDuurzaamheidsklasse(float duurzaamheidsklasse) {
        this.duurzaamheidsklasse = duurzaamheidsklasse;
    }

    public int getDichtheid() {
        return dichtheid;
    }

    public void setDichtheid(int dichtheid) {
        this.dichtheid = dichtheid;
    }

    public String getToepassingen() {
        return toepassingen;
    }

    public void setToepassingen(String toepassingen) {
        this.toepassingen = toepassingen;
    }
}
