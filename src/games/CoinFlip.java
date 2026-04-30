

package games;

import utils.ToolKit;


public class CoinFlip implements Game {

	private final String name = "Heads or Tails";
	private ToolKit tools;
	private CoinFlipGameEngine engine;
	
	public CoinFlip(ToolKit tools) {
		this.tools = tools;
		this.engine = new CoinFlipGameEngine(tools);
		
	}
	
	
	@Override
	public void run(String name) {
	     
		System.out.println("\n***** LET'S PLAY! ***** ");
		
		   int choice;
		    choice = tools.console.deployOptions(name);
		    
		    if(choice == 3) {
		    	return;
		    } else {
		    	engine.initializeEngine(choice);
		    }
		        
		          
		   
	}
	
	
	
	@Override
	public String getName() {
		return name;
	}
}
