package Week3.Opdracht8;

import java.time.LocalDateTime;

public class Computer implements Goed{
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;


    public Computer(String tp, String adr,double pr,int jr){
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }
    public double huidigeWaarde(){ //Jaarlijks 40% minder gerekend vanaf het bouw- of productiejaar
        double prijs = 0.0;
        double perJaarkorting = 0.4;
        if (productieJaar == LocalDateTime.now().getYear()){
            return aanschafPrijs;}
        else{
            int divJaar = LocalDateTime.now().getYear() - productieJaar;
            prijs += aanschafPrijs - (aanschafPrijs * (divJaar * perJaarkorting));
            if (prijs <= 0){
                return (0.0);}
            return (prijs);}
    }
    public boolean equals(Object obj){
        if (obj instanceof Computer ){
            if(((Computer) obj).type.equals(type)){
                if(((Computer) obj).productieJaar == productieJaar){
                return true;}}}
            return false;}

    public String toString(){
        return("Computer:" + type + " en gebouwd in " + productieJaar + " voor de prijs: €" + String.format("%.1f",huidigeWaarde()));
    }
}
