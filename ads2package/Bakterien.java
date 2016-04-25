package ads2package;

public class Bakterien 
{
    static int bt= 0;   // teilbare Bakterien
    static int bn= 1;   // neue Bakterien
    static int stunde= 1;
    
    public void incubus(int endzeit)
    {
        while (stunde<=endzeit)
        {
            int bg= bt+bn;  // Gesamtzahl der Bakterien
            bn= bt;
            bt= bg;
            System.out.println( "Zur Stunde "+ stunde++ +" gibt es "+bg+" Bakterien." ); 
        }
    }

    public void incubus(double precision)
    {
        double ratio= (double)bt/bn;
        incubus(ratio, precision);
    }

    private double incubus(double oldratio, double precision)
    {
        int bg= bt+bn;
        double ratio= 1.0*bg/bt;
        bn= bt;
        bt= bg;
        System.out.println( "Zur Stunde "+ stunde++ + " gibt es "+bg+" Bakterien. Wachstumstrate: "+ratio); 
        if (Math.abs(ratio-oldratio)>precision)
        {
            ratio= incubus(ratio, precision);
        }
        return ratio;
    }
}
