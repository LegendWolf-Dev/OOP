package week1.opdracht7;

public class Voetbalclub {
   public String naam;
   public Integer aantalGewonnen = 0;
   public Integer aantalGelijk = 0;
   public Integer aantalVerloren = 0;

   public Voetbalclub(String naam){
       this.naam = naam;

   }

   public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public Integer aantalGespeeld(){
        return aantalGelijk + aantalVerloren + aantalGewonnen;
    }
    public Integer aantalPunten(){
        return (aantalGewonnen * 3) + aantalGelijk;
    }
    public String toString(){
       return (naam + "   " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " +  aantalVerloren + " " + aantalPunten());
    }
}
