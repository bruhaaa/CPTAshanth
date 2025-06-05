import arc.*;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class blackjack{
	public static void main(String[] args){
		Console con = new Console("Blackjack", 1280, 720);
		String strUser;
		int intInput;
		int intCard[][];
		int intBal = 1000;
		
		// deck of cards
		intCard = new int[52][3];
		
		//the diamonds
		//diamond ace
		intCard[0][0] = 1;
		intCard[0][1] = 1;
		intCard[0][2] = (int)(Math.random()*100+1);
		
		//2 of diamond
		intCard[1][0] = 2;
		intCard[1][1] = 1;
		intCard[1][2] = (int)(Math.random()*100+1);
		
		// 3 of diamond
		intCard[2][0] = 3;
		intCard[2][1] = 1;
		intCard[2][2] = (int)(Math.random()*100+1);
		
		//4 of diamond
		
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
