package Week2.Opdracht4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private String Huisbaas;

    public Huis(String adres, int bouwjaar){
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }
    public void setHuisbaas(Persoon Huisbaas) {
          this.Huisbaas = Huisbaas.naam +"; leeftijd "+ Huisbaas.leeftijd + " jaar.";
    }
    public String getHuisbaas(){
        return(Huisbaas);
    }
    public String toString(){
        return("Huis " + adres + " is gebouwd in " + bouwjaar + " en heeft huisbaas " + Huisbaas);
    }
}
