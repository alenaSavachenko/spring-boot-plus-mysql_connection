package adsd.app.bouwapp.model;

public class Grondstof {

    private String naam;
    private boolean beschikbaar;
    private float percentageAanPrimaireGrondstoffen;
    private float percentageAanSecundaireGrondstoffen;
    private int losmaakbaarheid;
    private String locatie;

    public String getName() {
        return naam;
    }

    public void setName(String naam) {
        this.naam = naam;
    }

    public boolean isBeschikbaar() {
        return beschikbaar;
    }

    public void setBeschikbaar(boolean beschikbaar) {
        this.beschikbaar = beschikbaar;
    }

    public float getPercentageAanPrimaireGrondstoffen() {
        return percentageAanPrimaireGrondstoffen;
    }

    public void setPercentageAanPrimaireGrondstoffen(float percentageAanPrimaireGrondstoffen) {
        this.percentageAanPrimaireGrondstoffen = percentageAanPrimaireGrondstoffen;
    }

    public float getPercentageAanSecundaireGrondstoffen() {
        return percentageAanSecundaireGrondstoffen;
    }

    public void setPercentageAanSecundaireGrondstoffen(float percentageAanSecundaireGrondstoffen) {
        this.percentageAanSecundaireGrondstoffen = percentageAanSecundaireGrondstoffen;
    }

    public int getLosmaakbaarheid() {
        return losmaakbaarheid;
    }

    public void setLosmaakbaarheid(int losmaakbaarheid) {
        this.losmaakbaarheid = losmaakbaarheid;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }
}
