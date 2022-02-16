package Week2.Opdracht4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon Huisbaas;

    public Huis(String adres, int bouwjaar){
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }
    public void setHuisbaas(Persoon huisbaas) {
            this.Huisbaas = huisbaas;
    }
    public Persoon getHuisbaas(){
        return(Huisbaas);
    }
    public String toString(){
        return("Huis " + adres + " is gebouwd in " + bouwjaar + " en heeft huisbaas " + Huisbaas);
    }
}
