package Week2.Opdracht5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> deLeerlingen;


    public Klas(String Kc){
        this.klasCode = Kc;
        this.deLeerlingen = new ArrayList<Leerling>();
    }
    public void voegLeerlingToe(Leerling L){
        deLeerlingen.add(L);
    }


    public void wijzigCijfer(String nm, double nweCijfer){
            for( Leerling leerling : this.deLeerlingen  ){
                if(leerling.getNaam().equals(nm)){
                    leerling.setCijfer(nweCijfer);}
        }
    }




    public ArrayList getLeerlingen(){
        return(deLeerlingen);
    }



    public int aantalLeerlingen(){
        return(deLeerlingen.size());
    }


    public String toString(){
        String txt ="";
        for (Leerling leerling : this.deLeerlingen ){
             txt += leerling.toString() + "\n";
        }
        return("In klas "+ klasCode + " zitten de volgende leerlingen: \n"
                + txt );
    }
}

