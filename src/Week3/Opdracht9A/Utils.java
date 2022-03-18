package Week3.Opdracht9A;

import java.text.ChoiceFormat;
import java.text.NumberFormat;

public class Utils {

    public static void main(String[] args) {
        System.out.println(Utils.euroBedrag(3.11314));
        System.out.println(Utils.euroBedrag(3.11314, 1));
    }

    public static String euroBedrag(double bedrag) {
        return ("€ "+String.format("%.2f", bedrag));
    }
    // Utils.euroBedrag(3.11314);              "€ 3,11
    // Utils.euroBedrag(3.11314, 1);          "€ 3,1"
    public static String euroBedrag(double bedrag, int precisie) {
        return ("€ "+String.format("%."+ precisie +"f", bedrag));
    }
}
