package core;

import utils.ToolKit;
import games.*;


public class MotherShip {

	private final Game[] games;
	public ToolKit tools;
	
	
	public MotherShip(ToolKit tools) {
		this.tools = tools;
		this.games = new Game[] { new Pokemon(tools), new Champions(tools),new PerfectNine(tools),new CoinFlip(tools) };
	}
	
	public int displayGames() {
		int option;
		
		option = tools.array.generateMenuFormat(games);
		
		return option;
	}
	
	public Game loadGame(int option) {
		
		if(option == games.length + 1) {
			return null;
		}

		int idx = option -1 ;
		 
		while( idx < 0 || idx >= games.length) {
			
			System.out.println("\nError ... Invalid option. Try again.");
			
			 idx = tools.array.generateMenuFormat(games);
			 idx = idx - 1;
		}
		
		return games[idx];
	}
}
