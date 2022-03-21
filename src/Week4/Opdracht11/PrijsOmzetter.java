package Week4.Opdracht11;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.IOException;

//Het onderstaande tekstbestand  bevat van een aantal artikelen de prijs in US Dollars.
// In de file staan de gegevens van één artikel op één regel. Op iedere regel staat een omschrijving van een artikel, dan een spatie, een dubbele punt, en weer een spatie, en dan de prijs van het artikel in dollars.
// Er moet nu een zelfde soort file worden gegenereerd maar dan met de prijs in euro's.

public class PrijsOmzetter {
    private File bronBestand;
    private File bestemmingBestand;
    private double us_DollarWorthInEuro;

    public String veranderDollarNaarEuro() {
        List<String> txt = new ArrayList<>();
        setBronBestand();
        setBestemmingBestand();
        setWaardeVanUSNaarEuro();
        try {
            Scanner reader = new Scanner(bronBestand);
            while (reader.hasNextLine()) {
                txt.add(reader.nextLine());
            }
            txt = dollarNaarEuro(txt);

            try {
                FileWriter writer = new FileWriter(bestemmingBestand);
                for (int i = 0; i < txt.size(); i++) {
                    writer.write(txt.get(i)+"\n");
                }
                writer.close();
            }catch (IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return("Geslaagd check: " + bestemmingBestand);

    }

    public List<String> dollarNaarEuro(List input){
        String string = "";
        String string2 = "";
        ArrayList output = new ArrayList();
        for (int i = 0; i < input.size(); i++) {
             string = input.get(i).toString();
             string = string.substring(string.indexOf(": "));
             string = string.replaceAll("\\D+\\.?\\D+","");
             //
             double prijs = Double.parseDouble(string);
             prijs = prijs * us_DollarWorthInEuro;
             string =" "+"€"+String.format("%.2f", prijs);
             //
            string2 = input.get(i).toString();
            int index = string2.indexOf(": ")+1;
            string2 = string2.substring(0,index);
            string2 += string;
            output.add(string2);
        }
        return (output);
    }


    public void setBronBestand(){
        Scanner st = new Scanner(System.in);
        System.out.println("Enter bronbestand: ");
        String in = "src/Week4/Opdracht11/"+st.nextLine();
        File tempFile = new File(in);
        if(tempFile.exists()){
            this.bronBestand = new File(in);}
        else{
            System.out.println("Bestand niet gevonden. Probeer het opnieuw.");
            setBronBestand();
        }
    }

    public void setBestemmingBestand(){
        Scanner st = new Scanner(System.in);
        System.out.println("Enter bestemmingbestand: ");
        String in = "src/Week4/Opdracht11/"+st.nextLine();
        File tempFile = new File(in);
        if(tempFile.exists()){
            this.bestemmingBestand = new File(in);}
        else{
            System.out.println("Bestand niet gevonden. Probeer het opnieuw.");
            setBestemmingBestand();}

    }
    public void setWaardeVanUSNaarEuro() {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter waarde van 1 US dollar in Eurocent: ");
        try {
            this.us_DollarWorthInEuro = st.nextDouble();
        } catch (InputMismatchException e) {
        System.out.println("Geen correcte waarde gevonden. Probeer het opnieuw.");
        setWaardeVanUSNaarEuro();}
    }}
