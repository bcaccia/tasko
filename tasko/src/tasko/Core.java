package tasko;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Core {

	public static void helpPage() {
		System.out.println("_____________________________________________________");
		System.out.println("\ntasko usage:");
		System.out.println("\nCommand format: tasko taskSummary -priority -context");
		System.out.println("Example command: tasko pay my bills -h -computer");
		System.out.println("_____________________________________________________");
	}
	
	// Parse input arguments into usable pieces
	public static void splitArgs(String[] args) {
		// Combine String Array into a single string for processing and remove all commas
		String combinedArgs = Arrays.deepToString(args).replace(",", "");
		// Split string at each space + dash
		String[] splitArgs = combinedArgs.split(" -");
		System.out.println(Arrays.deepToString(splitArgs));
		
		if (splitArgs.length != 3) {
			helpPage();
		}
		}
	}

	//TODO add method to check and sanitize incoming args
	
	// TODO add method to instantiate and store a new task object
	
	// TODO add save to csv method
	
	// TODO add read from csv method
	

