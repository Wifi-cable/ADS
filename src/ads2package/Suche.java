
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
            return -1;
        }
        else if (key<mitte)
        {
            return suche(key, anfang, mitte);
        }
        else 
        {
            return suche(key, mitte, ende);
        }
	}
}
