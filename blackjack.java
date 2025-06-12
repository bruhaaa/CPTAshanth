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
		
		con.println("                            Play (Enter 1)\n");
		con.println("                        View Leaderboard (Enter 2)\n");
		con.println("                              Quit (Enter 3)");
		intInput = con.readInt();
		
		
		if(intInput == 1){
			// this takes them to game
			
		}else if(intInput == 2){
			// views leaderboard
			
		}else if(intInput == 3){
			//quits game
			
		}
		intDeck = Deck.shuffledeck();
		
		
		
		
		
	
		
	}

}
