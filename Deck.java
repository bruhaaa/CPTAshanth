import arc.*;

public class Deck{
	public static void main(String[] args){
		Console con = new Console();
		int intDeck[][];
		intDeck = new int[52][3];
		int intSuit; 
		int intValue;
		
		 // Initialize deck with random numbers
        for(intSuit = 1; intSuit <= 4; intSuit++){
            for(intValue = 1; intValue <= 13; intValue++){
                int intRandom = (int)(Math.random() * 100 + 1);
                intDeck[(intSuit - 1) * 13 + (intValue - 1)][0] = intValue;
                intDeck[(intSuit - 1) * 13 + (intValue - 1)][1] = intSuit;
                intDeck[(intSuit - 1) * 13 + (intValue - 1)][2] = intRandom;        
            }
        }


        // Bubble sorts the deck, shuffling everything
        int intCount; 
        int intCount2;
        int intTempSuit ;
        int intTempValue; 
        int intTempRand;

        for(intCount = 0; intCount < 51; intCount++){
            for(intCount2 = 0; intCount2 < 51 - intCount; intCount2++){
                if(intDeck[intCount2][2] > intDeck[intCount2 + 1][2]){
                    intTempValue = intDeck[intCount2][0];
                    intTempSuit = intDeck[intCount2][1];
                    intTempRand = intDeck[intCount2][2];

                    intDeck[intCount2][0] = intDeck[intCount2 + 1][0];
                    intDeck[intCount2][1] = intDeck[intCount2 + 1][1];
                    intDeck[intCount2][2] = intDeck[intCount2 + 1][2];

                    intDeck[intCount2 + 1][0] = intTempValue;
                    intDeck[intCount2 + 1][1] = intTempSuit;
                    intDeck[intCount2 + 1][2] = intTempRand;
                }
            }
        }
		
	
	
	}
}
