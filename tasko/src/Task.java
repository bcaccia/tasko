import java.util.Arrays;
import java.util.Scanner;

public class Task {
	

	// TODO add constructor, use Date class in java.util
	public Task() {

	}


	public static void helpPage() {
		System.out.println("_____________________________________________________");
		System.out.println("\ntasko usage:");
		System.out.println("\nCommand format: tasko taskSummary -priority -context");
		System.out.println("Example command: tasko pay my bills -h -computer");
		System.out.println("_____________________________________________________");
	}

	public static void commandHeader() {
		System.out.println("_____________________________________________________________________________");
		System.out.println("Commands: a(add) | d(delete) | p(priority) | c(context) | s(sort) | q(quit)");
		System.out.println("_____________________________________________________________________________");
	}

	public static void menuOptions() {
		char userInput = Main.input.next().toLowerCase().charAt(0);
		switch (userInput) {
			case 'a' :
				addTask();
				break;

			case 'd' :
				System.out.println("d");
				break;

			case 'p' :
				System.out.println("p");
				break;

			case 'c' :
				System.out.println("c");
				break;

			case 's' :
				System.out.println("s");
				break;

			case 'q' :
				System.out.println("q");
				Main.runState = false;
				break;

			default :
				System.out.println("Invalid");
				break;
		}
	}

	public static void addTask() {
		String summary;
		Character priority;
		String context;

		System.out.println("Enter task summary: ");
		summary = Main.input.nextLine();

		System.out.println("Enter priority: ");
		priority = Main.input.nextLine().toLowerCase().charAt(0);

		System.out.println("Enter context: ");
		context = Main.input.nextLine();

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
