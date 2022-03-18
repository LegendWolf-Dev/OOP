package Week3.Opdracht8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud) {
        this.bedrijfsnaam = nm;
        this.budget = bud;
        this.alleGoederen = new ArrayList<>();
    }

    public void schafAan(Goed g) {
        if (budget >= g.huidigeWaarde()) {
            if (alleGoederen.contains(g)) {
                return;}
            else if(alleGoederen.size() > 1){
                for(Goed goed : this.alleGoederen){
                   if(goed.equals(g)){
                       return;
                   }}}
                alleGoederen.add(g);
                budget = budget - g.huidigeWaarde();}
        return;
    }

    public String toString() {
        String txt = "";
        for (Goed goed : this.alleGoederen){
                txt += goed.toString() + "\n";}
        return(bedrijfsnaam + " heeft een budget van €" + budget + " en heeft deze items:\n" + txt );}}
