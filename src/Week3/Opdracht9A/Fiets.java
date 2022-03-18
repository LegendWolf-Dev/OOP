package Week3.Opdracht9A;

import java.time.LocalDateTime;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp,double pr,int jr,int fnr){
        super(tp,pr,jr);


    }
    public double huidigeWaarde(){ //Jaarlijks 10% minder gerekend vanaf het bouw- of productiejaar
       double prijs = 0.0;
       int divJaar;
       double kortingPerJaar = 0.1;
        if(bouwjaar == LocalDateTime.now().getYear()){
           return(nieuwprijs);
       }
        else
            divJaar = LocalDateTime.now().getYear() - bouwjaar;
            prijs += nieuwprijs - (nieuwprijs * (kortingPerJaar * divJaar));
            if (prijs <= 0){
                return (0.0);}
        return(prijs);
    }
    public boolean equals(Object obj){
        if(obj instanceof Fiets){
            if(((Fiets) obj).framenummer == framenummer){
                if(((Fiets) obj).bouwjaar == bouwjaar){
                    return true;}}}
        return false;}


}
