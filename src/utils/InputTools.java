package utils;

import java.util.Scanner;

public class InputTools {

	private final Scanner keyboard;
	
	public InputTools (Scanner scanner) {
		this.keyboard = scanner;
	}
	
	/**
	 * Get the value of a string input, and
	 * returns it to the caller 
	 * 
	 * @param text -Text to display
	 * @return - the string value;
	 * 
	 */
	public String getString(String text) {
		
		while(true) {
			System.out.print(text);
			String input = keyboard.nextLine();
			
			if(input.isEmpty()) {
				System.out.println("\nError: You must enter a value.");
				continue;
			}
			return input;
		}
	}
	
	/**
	 * Get the value of a string input, check the correct format , parse 
	 * the string into an integer and returns it back to the caller. 
	 * 
	 * @param text -Text to display
	 * @return - an integer value;
	 * 
	 */
	
	public int getInt(String text) {
		
		while(true) {
			System.out.print(text);
			String input = keyboard.nextLine();
			
			if(input.isEmpty()) {
				System.out.println("\nError: You must enter a value");
				continue;
			}
			try {
				 int value = Integer.parseInt(input);
				 return value;
			}catch(NumberFormatException e) {
				System.out.println("\nValue must be a number.");
			}
		}
	}
	public void flushBuffer() {
		 keyboard.nextLine();
	}
	         
}
