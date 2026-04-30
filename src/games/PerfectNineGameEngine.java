package games;

import java.util.ArrayList;
import utils.ToolKit;

public class PerfectNineGameEngine {

	private ToolKit tools;
	
	public PerfectNineGameEngine(ToolKit tools) {
		this.tools = tools;
		
	}
	
    public void setUpEngine(int choice) {
		
		final int  RULES = 1, PLAY = 2 , BACK = 3;
		

		  switch(choice) {
		  
		  case RULES:
			   tools.console.deployOptions("Perfect Nine Rules");
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
		
        initializeEngine("data/words.txt");
		
		
	}
    public void initializeEngine(String fileName) {
		// Load file "data/words.txt" into ArrayList
		ArrayList<String> list = new ArrayList<>();
		
		list = tools.file.loadFile(fileName);
		
		int randomIdx = tools.array.getRandomIdx(list);
		
		String word = list.get(randomIdx);
		processOutCome(word);
	}
    public void processOutCome(String word) {
  	     String secretWord = word;
  	     String guess; 
  	     
    	 int attempt = 1;
    	 
    	 while(attempt <=3) {
    		 
    		 // Display hint
    		 displayHints(word, attempt);
    		 
    		 // get user's guess
    		 guess = getGuess("\nWhat is the secret word? ");
    		 System.out.println("\nYour guess: " + guess);
    		 
    		 // Compare words
    		 if(secretWord.equalsIgnoreCase(guess)) {
    			 System.out.println("\nCorrect ... you guessed the secret word perfectly!");
    			 return;
    		 }
    		 attempt++;
    	 }
  	  
		System.out.println("\nOh no! perhaps next time ... the word was " + secretWord +".");
		 
	}
	
	public void displayHints(String word, int attemp) {
	    
		
		char firstLetter = word.charAt(0);
	    char lastLetter = word.charAt(word.length() - 1);
	    char middleLetter = word.charAt(4);
	    
	    switch(attemp) {
	     
	    case 1:
	    	System.out.println("\nLet me give you a hand... here is your first clue!");
	    	System.out.printf("\n--> The word starts with '%s'.", firstLetter);
	    	break;
	    	
	    case 2:
	    	System.out.println("\nDon't give up just yet ... Here's another clue!!");
	    	System.out.printf("\n--> The word starts with '%s' and ends with '%s'.",firstLetter,lastLetter);
	    	break;
	    	
	    case 3:
	    	System.out.println("\nThis is your last chance ... Here's one final clue!!");
	    	System.out.printf("\n--> The word starts with '%s' and ends with '%s' , and the middle letter is '%s'.",
	    			firstLetter,lastLetter,middleLetter);
	    	break;
	    }
	
}
	public String getGuess(String text) {
		 
		String guess =  tools.input.getString(text);
		 return guess;
	}
	
}
