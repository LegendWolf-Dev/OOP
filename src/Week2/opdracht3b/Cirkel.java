package Week2.opdracht3b;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    public Cirkel(int radius,int xPositie,int yPositie){
            this.radius = radius;
            if (radius <= 0){
                throw new IllegalArgumentException ("Radius moet groter zijn dan " + radius + "!" );}
            this.xPositie = xPositie;
            this.yPositie = yPositie;

    }
    public String toString(){
            return("Cirkel (" + xPositie +", "+ yPositie +") met radius: " + radius);
    }
}
