import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class blackjack{
	public static void main(String[] args){
		Console con = new Console("Blackjack", 1280, 720);
		String strUser;
		int intInput;
		int intDeck[][];
		int intBal = 1000;
		int intCount;
		int intSuit;
		int intRandom = (int)(Math.random()*100+1);
		// deck of cards
		intDeck = new int[52][3];
		
		
	
		
	
		intDeck[0][0] = 1;
		intDeck[0][1] = 1;
		intDeck[0][2] = intRandom;
		
		//2 of diamond
		intDeck[1][0] = 2;
		intDeck[1][1] = 1;
		intDeck[1][2] = intRandom;
		
		// 3 of diamond
		intDeck[2][0] = 3;
		intDeck[2][1] = 1;
		intDeck[2][2] = intRandom;
		
	}

}


//Later

		/*con.println("                            Play (Enter 1)\n");
		con.println("                        View Leaderboard (Enter 2)\n");
		con.println("                              Quit (Enter 3)");
		intInput = con.readInt();
		
		
		if(intInput == 1){
			// this takes them to game
			
		}else if(intInput == 2){
			// views leaderboard
			
		}else if(intInput == 3){
			//quits game
			
		}*/
