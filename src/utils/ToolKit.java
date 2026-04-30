package utils;

import java.util.Scanner;

public class ToolKit {
	
    private Scanner keyboard;
    
    public final InputTools input;
    public final ArrayTools array;
    public final FileTools file;
    public final ConsoleUI console;
    
	public ToolKit(Scanner scanner) {
		
		this.keyboard = scanner;
		this.input = new InputTools(keyboard);
		this.array = new ArrayTools(input);
		this.file = new FileTools();
		this.console = new ConsoleUI(input);
		
	}
	
	
}
