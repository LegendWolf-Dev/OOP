package Week2.opdracht3b;

public class opdracht3b {
    public static void main(String[] args) {
        Cirkel c1 = null, c2 = null;

        try {
            c1 = new Cirkel(10, 0, 0);
            c2 = new Cirkel(0, 10, 10);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

        System.out.println(c1);
        System.out.println(c2);
    }
}
  /* Ik verwacht dat hij compleet niet meer werkt aangezien beide Cirkels c1 en c2 null hebben als data.
  *Dit zou in prencipe niet kunnen.
  *
  * Na test, hij voerd het uit. Maar geeft terug als printin beide Null. Dit had ik moeten kunnen zien aankomen
  * aangezien hij niet de methode Cirkel oproept dus nooit een exceptie krijgt. En dus ook nooit iets wordt veranderd.
  * Dus print hij de data in c1 en c2 die hij kreeg in het begin. Dat was dus Null.
  */
