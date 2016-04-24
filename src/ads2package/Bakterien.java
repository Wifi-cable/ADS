package ads2package;

public class Bakterien {
    int bt= 0;   // teilbare Bakterien
    int bn= 1;   // neue Bakterien
    
    public void incubus(int endzeit)
    {
        for (int stunde= 1; stunde<=endzeit; stunde++)
        {
            int bg= bt+bn;  // Gesamtzahl der Bakterien
            bn= bt;
            bt= bg;
            System.out.println( "Zur Stunde "+stunde+" gibt es "+bg+" Bakterien." ); 
        }
    }

    public void incubus(double precision)
    {
        int stunde= 0;
        double ratio= 10*precision;
        double oldratio;
        int bg;
        bg= bt+bn;
        do
        {
            oldratio= ratio;
            bg= bt+bn;  // Gesamtzahl der Bakterien
            ratio= 1.0*bg/bt;
            bn= bt;
            bt= bg;
            System.out.println( "Zur Stunde "+ ++stunde + " gibt es "+bg+" Bakterien. Wachstumstrate: "+ratio); 
        }
        while (Math.abs(ratio-oldratio)>precision);
    }
}
