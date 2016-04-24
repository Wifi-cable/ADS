package ads2package;

public class Bakterien {
	static int stunde= 1;
	static int bg=1;	//Bacterinen gesamt
	static int bt=0;	// Bactierien teilbar 
	static int bn=0;{//backterien neu
		
	if (bg==1||bg==2){ // wenn die gesamt zahl 1 oder 2 ist die neue zahl 1 oder null.
		bn=1;}	
	while(stunde<=15){
		for ( int zeit=0; zeit<16; zeit++){
			int bg= bt+bg;
			bn=bg;
		}
	}
System.out.println( "Zur stunde "+stunde+" gibt es "+bg+" Bakterien." );	
}
}