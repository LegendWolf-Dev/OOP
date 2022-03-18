package Week3.Opdracht9A;

import java.util.ArrayList;

public class Main_Practicum8 {
    public static void main(String[] args) {
        BedrijfsInventaris BI1 = new BedrijfsInventaris("Bard Inc",100000.0);
        //First Batch Same type
        Computer PC1 = new Computer("Laptop","86-9C-48-A1-A0-50", 200.0, 2010);
        Computer PC2 = new Computer("Laptop","86-9C-48-A1-A0-50", 200.0, 2010);
        Fiets F1 = new Fiets("Fiets", 180.0, 1999, 15674);
        Fiets F2 = new Fiets("Fiets", 180.0, 1999, 15674);
        Auto A1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto A2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        //Second Batch Different Type
        Computer PC3 = new Computer("Desktop","B2-10-88-20-D1-BF",300.0, 2020);
        Fiets F3 = new Fiets("Mountainbike", 150.0, 2020, 26156);
        Auto A3 = new Auto("Audi A-klasse A 200", 30000.00, 2021,"6-9SW-42");
        //Add to BedrijfsInventaris
        BI1.schafAan(PC1);
        BI1.schafAan(PC2);
        BI1.schafAan(PC3);
        BI1.schafAan(F1);
        BI1.schafAan(F2);
        BI1.schafAan(F3);
        BI1.schafAan(A1);
        BI1.schafAan(A2);
        BI1.schafAan(A3);
        //Print BedrijfsInventaris
        System.out.println(BI1);
    }
}