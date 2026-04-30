package games;

import utils.ToolKit;


public class PerfectNine  implements Game{

	 private final String name;
	 private ToolKit tools;
	 private PerfectNineGameEngine engine;
	 
		public PerfectNine(ToolKit tools) {
			this.tools = tools;
			this.name = "The Perfect Nine";
			this.engine = new PerfectNineGameEngine(tools);
		}
	 
	
	
	@Override
	public void run(String name) {
		    int choice ;
		    
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
