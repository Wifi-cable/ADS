package ads2package;

public class MainAdsUebung2 {
    public static void main(String[] args) 
    {
        int endtime = 15;  // use scanner instead?
        System.out.println("Inkubator mit fester Inkubationszeit "+ endtime + " Stunden");
        Bakterien inkubator1;
        inkubator1 = new Bakterien();
        inkubator1.incubus(endtime);

        double precision= 0.00001;
        System.out.println("\nInkubator zur Bestimmung der stündlichen Wachstumsrate mit Genauigkeit "+precision);
        Bakterien inkubator2;
        inkubator2 = new Bakterien();
        inkubator2.incubus(precision);
    }
}
