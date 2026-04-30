package games;


import utils.ToolKit;

public class Pokemon implements Game {

	 private final String name;
	 private ToolKit tools;
	 private PokemonGameEngine engine;
	 
	 public Pokemon(ToolKit tools) {
		 this.tools = tools;
		 this.name = "Guess The Pokemon";
		 this.engine = new PokemonGameEngine(tools);
	 }
	
	   // Entry point
		@Override
		public void run( String name) {
			int choice;
			
			do {
				choice = tools.console.deployOptions(name);
				engine.setUpEngine(choice);
				
			} while (choice != 3);
				
		}
		
		 @Override
			public String getName() {
				return name;
			}
		
}


