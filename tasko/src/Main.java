
public class Main {

    public static void main(String[] args) {
        TaskFactory taskFactory = new TaskFactory();
        boolean runState = true;

        while (runState) {
            taskFactory.commandHeader();
            taskFactory.menuOptions();
            taskFactory.viewTasks();
        }


    }

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
