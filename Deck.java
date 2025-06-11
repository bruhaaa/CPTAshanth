import arc.*;

public class Deck{
	public static void main(String[] args){
		Console con = new Console();
		int intDeck[][];
		intDeck = new int[52][3];
		int intRandom = (int)(Math.random()*100+1);
		int intSuit; 
		int intValue;
		
		// theres 52 rows and 3 columns
		
		//column 0 is the value
		//column 1 is the suit
		//column 2 is the random number
		// we should loop the rows to 52 and columns up to 3
		// values up to 13
		int intCount;
		
		
			
		for(intSuit = 1; intSuit <= 4; intSuit++){
			for(intValue = 1; intValue <=13; intValue++){
				intDeck[intValue][0] = intValue;
				intDeck[intValue][1]= intSuit;
				intDeck[intValue][2] = intRandom;		
				
			}
			
			
		}
		
	
	
	}
}
