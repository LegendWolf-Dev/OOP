package week1.opdracht6;

public class Zwembad {
    private double Breedte;
    private double Lengte;
    private double Diepte;
    public double inhoud;

        public Zwembad(double Breedte,double Lengte,double Diepte){
            this.Breedte = Breedte;
            this.Lengte = Lengte;
            this.Diepte = Diepte;
    }
    public Zwembad(){
    Breedte = 0;
    Lengte = 0;
    Diepte = 0;
    }


    public double getBreedte(){
        return Breedte;
    }
    public double getLengte(){
        return Lengte;
    }
    public double getDiepte(){
        return Diepte;
    }
    public void setBreedte(double x){
        Breedte = x;
    }
    public void setLengte(double y){
        Lengte = y;
    }
    public void setDiepte(double z){
        Diepte = z;
    }
    public double inhoud(){
            inhoud = Lengte * Breedte * Diepte;
            return inhoud;
    }
    public String toString(){
           return ("Dit zwembad is " + Breedte + " meter breed, " + Lengte + " meter lang, en " + Diepte + " meter diep.");
    }
}
