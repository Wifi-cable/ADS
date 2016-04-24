
package ads2package;
import java.util.Scanner;
public class Suche {
	Scanner in= new Scanner (System.in);
	int key=in.nextInt(); 
	int anfang=1;
	int ende =10; // not recursive do wile key!=mitte?
	int mitte=(anfang+ende)/2;{
	
	
	if (key<mitte){
		mitte+=ende/2;
	}
	if (key>mitte)
	else (mitte==key){
		System.out.println(key+ "gefunden");
		}
}
}