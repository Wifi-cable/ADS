
package ads2package;
import java.util.Scanner;
public class Suche {
	Scanner in= new Scanner (System.in);
	
    int suche()
    {
        System.out.println("Bitte eingeben zu wollen die Zahl zu suchen. ");
        int key=in.nextInt(); 
        int anfang=1;
        int ende =10; // not recursive do wile key!=mitte?
        return suche(key, anfang, ende);
    }

    int suche(int key, int anfang, int ende)
    {
        int mitte=(anfang+ende)/2;
        if (key == mitte)
        {
            System.out.println(key+ " gefunden");
            return mitte;
        }
        else if (anfang == ende)
        {
            System.out.println(key+ " nicht gefunden");
            return 1<<31;
        }
        else if (key<mitte)
        {
            return suche(key, anfang, mitte-1);
        }
        else 
        {
            return suche(key, mitte+1, ende);
        }
	}
    // Alternative Version ohne Rekursion
    int suche(boolean b)
    {
        System.out.println("Bitte eingeben zu wollen die Zahl zu suchen. ");
        int key=in.nextInt(); 
        int anfang=1;
        int ende =10; // not recursive do wile key!=mitte?
        int mitte=(anfang+ende)>>1;
        while (key != mitte)
        {
            if (anfang == ende)
            {
                System.out.println(key+ " nicht gefunden");
                return 1<<31;
            }
            if (key<mitte)
                ende= mitte-1;
            else
                anfang= mitte+1;
            mitte=(anfang+ende)>>1;
        }
        System.out.println(key+ " gefunden");
        return mitte;
    }
}
