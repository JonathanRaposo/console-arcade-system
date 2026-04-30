package utils;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import utils.InputTools;
import games.Game;

public class ArrayTools {
	
	  
	 private Random random;
	 private InputTools input;
	 
	 public ArrayTools(InputTools input) {
		 this.random = new Random();
		 this.input = input;
	 }
	
	 /**
     * Takes in an arr[] and based on its length , returns a random integer
     * to the caller
     * 
     * @param arr - The arr[] where it get its length.
     * @return a random integer based on the array size.
     */

	public <Type> int getRandomIdx(Type arr[]) {
		return random.nextInt(arr.length);
	}
	
	 /**
     * Takes in an ArrayList and based on its length , returns a random integer
     * to the caller
     * 
     * @param arr - The ArrayList where it get its length.
     * @return a random integer based on the array size.
     */
	
	public <Type> int getRandomIdx(ArrayList<Type> arr) {
		return random.nextInt(arr.size());
	}
	

    /**
     * Loops through an arr[] and prints its content
     * 
     * @param arr - The arr[] to loop through
     */
	 public <Type> void loop(Type[] arr) {
		 
		 for(Type item: arr) {
			 System.out.println(item);
		 }
	 }
	 /**
     * Loops through an ArrayList and prints its content
     * 
     * @param arr - The Arraylist to loop through
     */
	public <Type> void loop(ArrayList<Type> arr) {
		
		for(Type item: arr) {
			System.out.println(item);
		}
	}
	
	public  int generateMenuFormat(Game arr[]) {
		  
		 int option;
		 
		 for(int i = 0 ; i < arr.length; i++) {
			 
			 String gameName = arr[i].getName();
			 System.out.printf("\t%d. %s.\n", (i+1), gameName);
		 }
		 
		 System.out.printf("\t%d. %s\n", (arr.length + 1), "Go back.");
		
		 option =  input.getInt("Option: ");
		 
		 return option;
	}
}
