import java.time.LocalDateTime;

public class Task {

    private String summary;
    private String priority;
    private String context;
    private LocalDateTime creationTime;

    public Task(String summary, String priority, String context) {
        this.summary = summary;
        this.priority = priority;
        this.context = context;
        this.creationTime = LocalDateTime.now();
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

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "summary='" + summary + '\'' +
                ", priority='" + priority + '\'' +
                ", context='" + context + '\'' +
                ", creationTime=" + creationTime +
                '}';
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



