package app;

import java.util.Scanner;
import utils.ToolKit;
import core.MotherShip;
import games.*;


public class Arcade {

	  public static void main(String[] args) {
		  
		  final int INFO = 1, GAMES = 2, QUIT = 3;
		  int choice;
		  
		  Scanner keyboard = new Scanner(System.in);
		  ToolKit tools = new ToolKit(keyboard);
		  MotherShip gameHub = new MotherShip(tools);
		  
		  
		  do {
			  choice = tools.console.deployOptions("Main Options");
			  
			  switch(choice) {
			  
			  	case INFO:
				    tools.console.deployOptions("Arcade Info");
				    break;
				    
			  	case GAMES:
			  		tools.console.deployOptions("Games Intro");
			  		int option =  gameHub.displayGames();
			  		Game game = gameHub.loadGame(option);
			  		if(game == null) {
			  		    break;	  		
			  		} 
			  		String name = game.getName();
			  		game.run(name);
			  		break;
			  	case QUIT:
			  		 tools.console.endMessage();
			  		break;
			  	default:
			  	tools.console.deployOptions("Invalid Option");
			     
			  }
		  } while (choice != QUIT);
		  
		  keyboard.close();
	  }
}
