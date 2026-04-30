package games;

import utils.ToolKit;
import java.util.Random;

public class CoinFlipGameEngine {

	private ToolKit tools;
	private Random random;
	
	public CoinFlipGameEngine (ToolKit tools) {
		this.tools = tools;
		this.random = new Random();
	}
	
	public void initializeEngine(int option) {
		
		     processOutCome(option);
	}
	  
	
	  /**
	   * Simulates the tossing of the coin (Heads/Tails), and
	   * returns it back to the caller
	   * 
	   * @Return - "Heads" / "Tails"
	   *
	   * 
	   */
	
	public String tossCoin() {
		
		int coinSide = random.nextInt(2);
		String result = coinSide == 0? "Heads": "Tails";
		
		System.out.println("\nCoin Toss  ====> " + result);
		return result;
	}
	
	
	
	public String getCountSide(int option) {
		  String guess ;
		  int choice = option;	  
		  guess = choice == 1? "Heads": "Tails";
		  
		  System.out.println("\nPlayer picked  ====> "+ guess);
		  return guess;
		  
	}
	public void processOutCome(int option) {
		
		String userGuess,coinToss;
		String answer;
		
		 int wins = 0 ;
		 int losses = 0;
		 
		 while(true) {
			 
			 System.out.println("************************************************");
			// get guess	
			 userGuess = getCountSide(option);
			
			// Flip coin
			coinToss = tossCoin();
			
			///Determine result, update accumulators and display the game outcome
		 boolean result = 	gameOutCome(userGuess, coinToss); 
			
			if(result) {
				wins++;
			} else {
				losses++;
			}
			
			
			System.out.println("************************************************");
			
			char again ;
			
			answer = tools.input.getString("\nDo you want to play again (y/n) ?");
			again = answer.charAt(0);
			
		
			if(again != 'Y' && again != 'y') {
				
			System.out.println("************************************************");
			System.out.println("************************************************");
			System.out.println("                  GAME SUMMARY              ");;
			System.out.println("WINS:   "+ wins);
			System.out.println("LOSSES: "+ losses);
			System.out.println();
			System.out.println("************************************************");
			System.out.println("************************************************");	
				break;
			}
			
		 }
	}
	/**
	   * Determine & display the game outcome
	   * 
	   * @param   pGuess - Player's guess ("Heads/Tails")
	   * @param  cFace  - Coin face ("Heads/Tails")
	   * 
	   */
	
	public boolean gameOutCome(String pGuess, String pFace) {
		
		  if(pGuess.equals(pFace)) {
			  System.out.println("\nCongratulation ... you win!");
			  return true;
		  } else {
			  System.out.println("\nSorry ... better luck next time.");
			  return false;
		  }
	}

}

