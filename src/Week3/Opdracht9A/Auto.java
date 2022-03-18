package Week3.Opdracht9A;

import java.time.LocalDateTime;

public class Auto extends Voertuig {
    private String kenteken = "";

    public Auto(String tp,double pr,int jr,String kt){
        super(tp,pr,jr);
        this.kenteken = kt;

    }
    public double huidigeWaarde(){ //Jaarlijks 30% minder gerekend vanaf het bouw- of productiejaar
        double prijs = 0.0;
        double perJaarkorting = 0.3;
        if (bouwjaar == LocalDateTime.now().getYear()){
            return nieuwprijs;}
        else{
            int divJaar = LocalDateTime.now().getYear() - bouwjaar;
                prijs += nieuwprijs - (nieuwprijs * (divJaar * perJaarkorting));
                if (prijs <= 0){
                    return (0.0);}
                return (prijs);}
    }
    public boolean equals(Object obj) {
        if (obj instanceof Auto) {
            if(((Auto) obj).kenteken.equals(kenteken)){
                if(((Auto) obj).bouwjaar == bouwjaar){
                    return true;}}}
        return false;}


}
