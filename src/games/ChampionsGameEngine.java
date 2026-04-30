package games;

import java.util.ArrayList;
import utils.ToolKit;


public class ChampionsGameEngine {
  
	private ToolKit tools;
	
	public ChampionsGameEngine(ToolKit tools) {
		this.tools = tools;
		
	}
	
	
public void setUpEngine(int choice) {
		
		final int  RULES = 1, PLAY = 2 , BACK = 3;
		
		  switch(choice) {
		  
		  case RULES:
			  
			  tools.console.deployOptions("Champions Rules");
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
	
	System.out.println("\n***** LET'S PLAY! *****");
	
	initializeEngine("data/champions.txt");
	
	
}
public void initializeEngine(String fileName) {
	// Load file "data/champions.txt" into ArrayList
		
		ArrayList<String> list = new ArrayList<>();
		
		list = tools.file.loadFile(fileName);
	    
		int randomIdx = tools.array.getRandomIdx(list);
		
		String teamName = list.get(randomIdx);
		
		 processOutCome(list,teamName);
		
	
}
public int calcWins( ArrayList<String> champions, String teamName) {
	int wins = 0;
	
	for(String champion: champions) {
		if(champion.equalsIgnoreCase(teamName)) {
			wins++;
		}
	}
	return wins;
}

public void processOutCome(ArrayList<String> champions,String teamName) {
     
	  while(true) {
		  
		  System.out.println("\nYour team Champion is "+ teamName);
		  
		  int teamWins = calcWins(champions, teamName);
		  int teamGuess = getGuess(teamName);
		  
		 
		  
		  if(teamWins == teamGuess) {
			  System.out.println("\nCorrect!!! ... You know your World Champions!!!");
		  } else {
			  System.out.println("\nSorry ... the "+ teamName + "has won " + teamWins + " times.");
		  }
		  
		  String answer = tools.input.getString("\nDo you want to play another round (y/n)? ");
		  char again = answer.charAt(0);
		  
		  if(again != 'Y' && again != 'y') {
				break;
			 }
		  System.out.println("\nAlrighty then!! ... let's play again!");
	  }
	
	
}


public int getGuess(String teamName) {
	 
     int num;
       do {
    	   num = tools.input.getInt("\nHow Many World Series has "+ teamName + " won? ");
    	   if(num < 1) {
    		   System.out.println("\nGuess must be greater than 1.");
    	   }
    	   
       }while( num < 1);
       
       return num;
}
}
