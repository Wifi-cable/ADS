package ads2package;

public class Bakterien {
    static int bt= 0;   // teilbare Bakterien
    static int bn= 1;   // neue Bakterien
    
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
}
