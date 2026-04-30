package utils;

import java.util.Scanner; 

public class ConsoleUI {

	final String POKEMON = "Guess The Pokemon", 
			     CHAMPIONS = "World Series Champions", 
			     PERFECT9 = "The Perfect Nine",
			     HEADS_OR_TAILS = "Heads or Tails",
			     HEADS_OR_TAILS_RULES = "Heads or Tails Rules",
	             POKEMON_RULES = "Pokemon Rules",
	             CHAMPIONS_RULES = "Champions Rules",
	             PERFECT9_RULES = "Perfect Nine Rules",
	             MAIN_OPTIONS = "Main Options",
	             ARCADE_INFO = "Arcade Info",
	             GAMES_INTRO = "Games Intro",
	             INVALID_OPTION = "Invalid Option";
	             
	public InputTools input;
	
	public ConsoleUI(InputTools input) {
		this.input = input;
	}
	
	 public int deployOptions(String gameName) {
		 
		 int choice = 0;
		 
		 switch(gameName) {
		 
		 case CHAMPIONS:
			 choice = getChampionsOptions();
			  break;
		 case POKEMON:
			  choice =  getPokemonOptions();
			  break;
		 case PERFECT9:
			 choice = getPerfectNineOptions();
			  break;
		 case HEADS_OR_TAILS:
			 choice = getHeadsOrTailsOptions();
			 break;
		 case POKEMON_RULES:
			  displayPokemonRules();
			  choice =  getPokemonOptions();
			  break;
		 case CHAMPIONS_RULES:
			  displayChampionsRules();
			  choice = getChampionsOptions();
			  break;
		 case PERFECT9_RULES:
			  displayPerfectNineRules();
			  choice = getPerfectNineOptions();
			  break;
		 case HEADS_OR_TAILS_RULES:
			 displayHeadorTalesRules();
			 choice = getHeadsOrTailsOptions();
		 case  MAIN_OPTIONS:
			   choice = mainOptions();
		       break;
		       
		 case ARCADE_INFO:
			   displayProgramInfo();
			   choice = -1;
			   break;
		 case GAMES_INTRO:
			  displayGamesIntro();
			  choice = -1;
			  break;
		 case INVALID_OPTION:
			  displayError();
			  choice = -1;
			  break;
		 }
		 return choice;
		 
	 }
	 
	 public int getHeadsOrTailsOptions() {
		    int choice;
		    
		    do {
		    	  System.out.println("\nChoose one of the following:");
				  System.out.println("\t1. Heads.");
				  System.out.println("\t2. Tails.");
				  System.out.println("\t3. Back to main menu.");
				  choice = input.getInt("Option: ");
				  if(choice < 1 || choice > 3) {
					 System.out.println("\nError ... Invalid option. Try again.\"");
				  }
		    } while(choice < 1 || choice >3);
		   
            return choice;
	 }
	 
	  public int getPerfectNineOptions() {
		   int choice ;
		   
		       do {
		    	System.out.println("\nThe Perfect Nine Game ...\n");
		   		System.out.println("Choose one of the following options:");
		   		System.out.println("\t1. See the Rules of the Game.");
		   		System.out.println("\t2. Guess the Perfect Nine Word.");
		   		System.out.println("\t3. Back to main menu.");
		   		choice = input.getInt("Option: ");
		   		if(choice < 1 || choice > 3) {
					 System.out.println("\nError ... Invalid option. Try again.");
				}
		    	   
		       } while (choice < 1 || choice > 3);
		  return choice;
	  }
	 public int getChampionsOptions() {
		 int choice;
			 do {
				 System.out.println("\n***** WORLD SERIES CHAMPIONS ***** ...\n");
					System.out.println("Choose one of the following options:");
					System.out.println("\t1. Rules of the Game.");
					System.out.println("\t2. Guess the Championships.");
					System.out.println("\t3. Back to main menu.");
					choice = input.getInt("Option: ");
					if(choice < 1 || choice > 3) {
						 System.out.println("\nError ... Invalid option. Try again.");
					}
			 }while(choice < 1 || choice > 3);
			
			return choice;
	 } 
	 
	 public int getPokemonOptions() {
		    int choice;
		    
		 do {
			   System.out.println("\n***** GUESS THE POKEMON *****\n");	
			   System.out.println("\t1. Game Explanation.");
			   System.out.println("\t2. Play.");
			   System.out.println("\t3. Back to main menu.");
			   choice = input.getInt("Option: ");
			   if(choice < 1 || choice > 3) {
				   System.out.println("\nError ... Invalid option. Try again.");
			   }
		 } while (choice < 1 || choice > 3);
		 
		 return choice;
	 }
	 public void displayPokemonRules() {
		    System.out.println("==============================================");
		    System.out.println("             GUESS THE POKEMON ");
		    System.out.println("==============================================");
		    System.out.println();
		    System.out.println("In this game, you will try to guess the name");
		    System.out.println("of a hidden Pokemon based on clues provided");
		    System.out.println("by the system.");
		    System.out.println();
		    System.out.println("Game Rules:");
		    System.out.println("- The system will select a random Pokemon.");
		    System.out.println("- You will be given hints about the Pokemon.");
		    System.out.println("- Type your guess and press Enter.");
		    System.out.println("- The game shows the results and ends.");
		    System.out.println();
		    System.out.println("Here the list of popular pokemons so you can memorize them:");
		    System.out.println("Pikachu");
		    System.out.println("Bulbasaur");
		    System.out.println("Ivysaur");
		    System.out.println("Vinuasur");
		    System.out.println("Charmander");
		    System.out.println("Charmeloen");
		    System.out.println("Charizard");
		    System.out.println("Squirtle");
		    System.out.println("Wartortle");
		    System.out.println("Blastoise");
		    System.out.println();
		    System.out.println("Good luck!");
		    System.out.println("==============================================");
	 }
	 
	 public void displayHeadorTalesRules() {
		    System.out.println("==============================================");
		    System.out.println("               HEADS OR TAILS ... ");
		    System.out.println("==============================================");
		    System.out.println("\nGuessing game where the player attemps to guess");
			System.out.println("the tossing of a coin (Heads/Tails");
		    System.out.println();
		    System.out.println("Good luck!");
		    System.out.println("==============================================");
		 
	 }
	 //* 
	// )
	 public void displayChampionsRules() {
		    System.out.println("==============================================");
		    System.out.println("             WORLD SERIES CHAMPIONS ... ");
		    System.out.println("==============================================");
		    System.out.println("\nThe goal of the World Series Champions game");
			System.out.println("is to guess how many times a team has won");
		    System.out.println("the tournament. How much do you know about baseball?");
		    System.out.println();
		    System.out.println("Good luck!");
		    System.out.println("==============================================");
	 }
	 public void displayPerfectNineRules() {
		    System.out.println("==============================================");
		    System.out.println("             THE PERFECT NINE GAME ... ");
		    System.out.println("==============================================");
		    System.out.println("\nThe goal of the Purfect Nine game is");
	    	System.out.println("to guess a secret nine-letter word in");
	    	System.out.println("at most three attemps ... Can you do it?");
	    	System.out.println("There is help along the way!");
	    	System.out.println();
			System.out.println("Good luck!");
			System.out.println("==============================================");
	 }
	 
	public int mainOptions() {
		
		 int option;
		System.out.println("\n******   CONSOLE ARCADE SYSTEM   ******");
		System.out.println("\nChoose one of the the folling options:");
		System.out.println("\t1. Program Info.");
     	System.out.println("\t2. Games.");
     	System.out.println("\t3. Quit.");
		option = input.getInt("Option: ");
		return option;
		
	}
	public void displayProgramInfo() {
		System.out.println("============================================");
		System.out.println("    WELCOME TO THE CONSOLE ARCADE SYSTEM    ");
		System.out.println("============================================");
		System.out.println();
		System.out.println("This application is a console-based arcade");
		System.out.println("system that allows users to play multiple");
		System.out.println("games in a single program.");
		System.out.println();
		System.out.println("Games Featured:");
		System.out.println("- Guess the Pokemon!!");
		System.out.println("- World Series Champions");
		System.out.println("- Perfect Nine");
		System.out.println("- Heads or Tails");
		System.out.println();
		System.out.println("Select an option from the menu to begin.");
		System.out.println("Have fun and enjoy the games!");
		System.out.println("============================================");
	}
	
	public void endMessage() {
		System.out.println("\nGood Bye ...");
	}
	public void displayError() {
		System.out.println("\nError ... Invalid option. Try again.");
	}
	public void displayGamesIntro() {
		System.out.println("\n******   GAME LIST  ******\n");
	}
	
}
