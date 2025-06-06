import arc.*;

public class Deck{
	public static void main(String[] args){
		Console con = new Console();
		int intDeck[][];
		int intValue = 0 ;
		intDeck = new int[52][3];
		int intRandom = (int)(Math.random()*100+1);
		
		int intSuit = 0;
		
		int intCount2;
		
		// theres 52 rows and 3 columns
		
		//column 0 is the value
		//column 1 is the suit
		//column 2 is the random number
		// we should loop the rows to 52 and columns up to 3
		// values up to 13
		int intCount;
		
		
			
		for(intCount2 = 1; intCount2 <= 13; intCount2++){
			intValue = intValue+1;
			intSuit = intSuit+1;
			intDeck[intCount2][0] = intValue;
			intDeck[intCount2][1] = intSuit;
			intDeck[intCount2][2] = intRandom;
			
				
		}	
		
		for(intCount=1; intCount <=13; intCount++){
			con.println(intDeck[intCount][0]);
			
		}
		
	
		
		//the diamonds
		//diamond ace
		
		/*intDeck[0][0] = 1;
		intDeck[0][1] = 1;
		intDeck[0][2] = (int)(Math.random()*100+1);
		
		//2 of diamond
		intDeck[1][0] = 2;
		intDeck[1][1] = 1;
		intDeck[1][2] = (int)(Math.random()*100+1);
		
		// 3 of diamond
		intDeck[2][0] = 3;
		intDeck[2][1] = 1;
		intDeck[2][2] = (int)(Math.random()*100+1);
		
		//4 of diamond*/
	}
}
