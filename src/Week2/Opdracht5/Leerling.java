package Week2.Opdracht5;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String nm){
        this.naam = nm;
    }


    public String getNaam(){
        return(naam);
    }

    public double getCijfer(){
        return(cijfer);
    }

    public void setCijfer(double c){
        this.cijfer = c;
    }

    public String toString(){
        return(naam + " heeft cijfer: " + cijfer +"\n");
    }

}
