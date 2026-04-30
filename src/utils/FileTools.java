package utils;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class FileTools {
	
	public ArrayList<String>  loadFile(String fileName) {
		
		 File file = new File(fileName);
		 
		 ArrayList<String> arr = new ArrayList<>();
		 
		 if(!file.exists()) {
			 System.out.println("File not found.");
			 return arr;
		 }
		 
		 try {
			  Scanner inputFile = new Scanner(file);
			  while(inputFile.hasNext()) {
				  arr.add(inputFile.nextLine());
			  }
			  inputFile.close();
			 
		 }catch(IOException e) {
			 System.out.println("Error: Could not load file.");
		 }
		 return arr;
		 
	}

}
