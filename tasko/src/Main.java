import java.util.ArrayList;
import java.util.Scanner;

public class Main {



	public static void commandHeader() {
		System.out.println("_____________________________________________________________________________");
		System.out.println("Commands: a(add) | d(delete) | p(priority) | c(context) | s(sort) | q(quit)");
		System.out.println("_____________________________________________________________________________");
	}

	public static void menuOptions(TaskFactory taskFactory) {
		Scanner input = new Scanner(System.in);
		char userInput = input.next().toLowerCase().charAt(0);
		switch (userInput) {
			case 'a':
				taskFactory.addTask();
				break;

			case 'd':
				System.out.println("d");
				break;

			case 'p':
				System.out.println("p");
				break;

			case 'c':
				System.out.println("c");
				break;

			case 's':
				System.out.println("s");
				break;

			case 'q':
				System.out.println("q");
				break;

			default:
				System.out.println("Invalid");
				break;
		}
	}


	public static void main(String[] args) {
		boolean runState = true;
		ArrayList<Task> taskList = new ArrayList<>();
		TaskFactory taskFactory = new TaskFactory();

		while (runState) {
			commandHeader();
			menuOptions(taskFactory);
		}

	}

		/*
		Task taskToBeAdded = new Task("here is a summary", 'l', "office");
		System.out.println(taskToBeAdded.getSummary() +
				taskToBeAdded.getPriority() +
				taskToBeAdded.getContext() +
				taskToBeAdded.getCreationTime());

		List<Task> taskList = new ArrayList<>();
		taskList.add(taskToBeAdded);
		taskList.add(taskToBeAdded);
		System.out.println(taskList.get(0).getCreationTime());
		System.out.println(taskList);
		System.out.println(taskList.size());
		*/

//	public static Task addTask() {
//		Scanner input = new Scanner(System.in);
//
//		String taskSummary;
//		char taskPriority;
//		String taskContext;
//
//		System.out.println("Enter task: ");
//		taskSummary = input.nextLine();
//
//		System.out.println("Enter priority: ");
//		taskPriority = input.nextLine().toLowerCase().charAt(0);
//
//		System.out.println("Enter context: ");
//		taskContext = input.nextLine();
//
//		new Task(taskSummary, taskPriority, taskContext);
//	}
//
//	public static void helpPage() {
//		System.out.println("_____________________________________________________");
//		System.out.println("\ntasko usage:");
//		System.out.println("\nCommand format: tasko taskSummary -priority -context");
//		System.out.println("Example command: tasko pay my bills -h -computer");
//		System.out.println("_____________________________________________________");
//	}
//

//

}
