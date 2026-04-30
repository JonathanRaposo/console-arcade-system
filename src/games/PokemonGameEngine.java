package games;

import java.util.ArrayList;

import utils.ToolKit;
public class PokemonGameEngine {
	
	private ToolKit tools;
	
	public PokemonGameEngine(ToolKit tools) {
		this.tools = tools;
	}
	
	
public void setUpEngine(int choice) {
		
		final int  RULES = 1, PLAY = 2 , BACK = 3;
		

		  switch(choice) {
		  
		  case RULES:
			   tools.console.deployOptions("Pokemon Rules");
			  break;
			  
		  case PLAY:
			  play();
			  break;
			  
		  case BACK:
			  break;
		  }
		  
		  return ;
	}
	
	public void play () {
	     
		System.out.println("\n***** LET'S PLAY! ***** ");
		
        initializeEngine("data/pokemons.txt");
		
		
	}
	public void initializeEngine(String fileName) {
		// Load file "data/pokemons.txt" into ArrayList
		ArrayList<String> list = new ArrayList<>();
		
		list = tools.file.loadFile(fileName);
		
		int randomIdx = tools.array.getRandomIdx(list);
		
		String characterName = list.get(randomIdx);
		processOutCome(characterName);
	}
	
	public void processOutCome(String character) {
	  
	  
		 while(true) {
			 
			 displayHints(character);
			 
			 String guess = getGuess("\nWhat's the name of the pokemon ?");
			
			 System.out.println("\nYour answer: " + guess);
			 
			 if(character.equalsIgnoreCase(guess)) {
				 System.out.println("\nCorrect!!! you know your pokemons!");
			 } else {
				 System.out.printf("\nSorry ... The pokemon character was %s.\n",character );
			 }
			 String answer = tools.input.getString("\nDo you want to play another round (y/n)? ");
			 char again;
			 again = answer.charAt(0);
		
			 if(again != 'y' && again != 'Y') {
				 break;
			 }
			 System.out.println("\nAlrighty then!! ... let's play again!");
		 }
		 
	}
	
	public void displayHints(String character) {
	    
		int totalLetters = character.length();
		char firstLetter = character.charAt(0);
	    char lastLetter = character.charAt(character.length() - 1);
	    
	    System.out.println("\nLet me give you a hint!");
	    System.out.printf("\nThe character has %d letters.\n", totalLetters);
	    System.out.printf("Starts with: %s\n", firstLetter);
	    System.out.printf("Ends with: %s\n", lastLetter);
	
}
	public String getGuess(String text) {
		 
		String guess =  tools.input.getString(text);
		 return guess;
	}

}
