package tasko;

public class Task {
	
	// TODO add attributes
	// Date/Time, Priority, Context, Due Date
	String taskSummary = new String();
	String[] priority = {"l", "m", "h"};
	String context = new String();
	
	
	// TODO add constructor, use Date class in java.util
	public Task(String taskSummary, String[] priority, String context) {
		this.taskSummary = taskSummary;
		this.priority = priority;
		this.context = context;
		
	}
	
	// TODO add view task method
	public void viewTask() {
		System.out.println();
	}
	
	// TODO add delete method
	
	// TODO add edit method
	
	// TODO add change category method
	
	// TODO add set priority method
	
	// TODO add due date method

}
