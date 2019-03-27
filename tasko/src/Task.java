import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class defines the data structure of a task object. It is to be instantiated
 * and used within the TaskFactory class.
 */
public class Task {

    private String summary;
    private String priority;
    private String context;
    private String creationTime;

    /**
     * This constructor is used when the program is running and creates a new task
     * @param summary
     * @param priority
     * @param context
     */
    public Task(String summary, String priority, String context) {
        this.summary = summary;
        this.priority = priority;
        this.context = context;
        LocalDateTime localTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.creationTime = localTime.format(formatter);
    }

    /**
     * This constructor takes 4 arguments and is used when loading data back from a file so that
     * the timestamp is maintained and not replaced.
     * @param summary
     * @param priority
     * @param context
     * @param creationTime
     */
    public Task(String summary, String priority, String context, String creationTime) {
        this.summary = summary;
        this.priority = priority;
        this.context = context;
        this.creationTime = creationTime;
    }

    public Task() {
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return summary +
                " | priority=" + priority +
                " | context=" + context +
                " | created=" + creationTime;
    }
}

/*
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
*/



