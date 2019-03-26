import java.util.*;
import java.util.function.Function;

public class TaskFactory {

    private Scanner input;

    private ArrayList<Task> taskList = new ArrayList<>();
    private Task newTask;


    public TaskFactory() {
        input = new Scanner(System.in);
    }

    public void addTask() {

        String taskSummary;
        String taskPriority;
        String taskContext;

        System.out.println("Enter task: ");
        taskSummary = input.nextLine();

        System.out.println("Enter priority: ");
        taskPriority = input.nextLine().toLowerCase();

        System.out.println("Enter context: ");
        taskContext = input.nextLine();


        newTask = new Task(taskSummary, taskPriority, taskContext);

        taskList.add(newTask);
    }


    public void viewTasks() {
        int i = 0;
        for (Task x :
                taskList) {
            System.out.println(i + " | " + x.toString());
            i++;
        }

    }

    public void commandHeader() {
        System.out.println("_____________________________________________________________________________");
        System.out.println("Commands: a(add) | d(delete) | p(priority) | c(context) | q(quit)");
        System.out.println("_____________________________________________________________________________");
    }

    public void menuOptions() {
        Scanner input = new Scanner(System.in);
        char userInput = input.next().toLowerCase().charAt(0);
        switch (userInput) {
            case 'a':
                addTask();
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
}