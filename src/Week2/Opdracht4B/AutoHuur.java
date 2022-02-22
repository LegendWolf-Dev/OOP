package Week2.Opdracht4B;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public void Autohuur(){
    }
    public void setAantalDagen(int aD){
        this.aantalDagen = aD;
    }
    public int getAantalDagen(){
        return(aantalDagen);
    }
    public void setGehuurdeAuto(Auto gA){
            this.gehuurdeAuto = gA;
    }
    public Auto getGehuurdeAuto(){
        return(gehuurdeAuto);
    }
    public void setHuurder(Klant k){
            this.huurder = k;
    }
    public Klant getHuurder(){
        return(huurder);
    }
    public double totaalPrijs(){

          return((gehuurdeAuto.getPrijsPerDag() * aantalDagen) - ((gehuurdeAuto.getPrijsPerDag() * aantalDagen) / huurder.getKorting()));
    }
    public String toString(){
//        if statement hier voor als values GehuurdeAuto en Huurder leeg zijn.
        if(huurder == null){
                return( "  er is geen auto bekend\n" +
                    "  er is geen huurder bekend\n" +
                    "  aantal dagen: 0 en dat kost 0.0");}
        else if (gehuurdeAuto == null) {
            return ("  er is geen auto bekend\n" +
                    "  " + getHuurder() + "\n" +
                    "  aantal dagen: 0 en dat kost 0.0");}
        else
            return( "autotype: " + getGehuurdeAuto() +"\n" +
                getHuurder() + "\n" +
                "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs());
    }
}
