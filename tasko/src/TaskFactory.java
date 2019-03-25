import java.util.ArrayList;
import java.util.Scanner;

public class TaskFactory {
    Scanner input = new Scanner(System.in);

    ArrayList<Task> taskList;
    Task newTask;


    public TaskFactory() {
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

        // TODO add new value to taskList
    }


    public void viewTasks() {
        for (Task x :
                taskList) {
            System.out.println(x.getSummary() + "," + x.getPriority() + "," + x.getContext() + "," + x.getCreationTime());
        }

        }
    }
