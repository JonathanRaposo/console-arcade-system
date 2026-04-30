package games;

import utils.ToolKit;

public class Champions implements Game {

	private final String name;
	private ToolKit tools;
	private ChampionsGameEngine engine;
	
	public Champions(ToolKit tools) {
		this.tools = tools;
		this.name = "World Series Champions";
		this.engine = new ChampionsGameEngine(tools);
	}
	
	
	//Entry point
	@Override
	public void run(String name) {
		 int choice;
		 
		 do {
			 choice = tools.console.deployOptions(name);
			 engine.setUpEngine(choice);
		 } while (choice !=3);
	}
	
	@Override
	public String getName() {
		return name;
	}

}
