import java.util.*;

public class TaskFactory {

    private Scanner input;
    private boolean runState = true;

    private ArrayList<Task> taskList = new ArrayList<>();
    private Task newTask;


    public TaskFactory() {
        input = new Scanner(System.in);
    }

    private void addTask() {

        String taskSummary;
        String taskPriority;
        String taskContext;

        System.out.println("Enter task: ");
        taskSummary = input.nextLine();

        System.out.println("Enter priority: ");
        taskPriority = input.nextLine().toLowerCase();
//        TODO limit input to numerical priority

        System.out.println("Enter context: ");
        taskContext = input.nextLine();


        newTask = new Task(taskSummary, taskPriority, taskContext);

        taskList.add(newTask);
    }

    public boolean isRunState() {
        return runState;
    }

    public void viewTasks() {
        int i = 0;
        for (Task x :
                taskList) {
            System.out.println(i + " | " + x.toString());
            i++;
        }

    }

    private void sortAscPriority() {

        Collections.sort(taskList, new Comparator<Task>(){

            public int compare(Task t1, Task t2) {

                return String.valueOf(t1.getPriority()).compareTo(t2.getPriority());
            }
        });

    }
    private void sortDscPriority() {

        Collections.sort(taskList, new Comparator<Task>(){

            public int compare(Task t1, Task t2) {

                return String.valueOf(t2.getPriority()).compareTo(t1.getPriority());
            }
        });

    }

private void sortAscContext() {

        Collections.sort(taskList, new Comparator<Task>(){

            public int compare(Task t1, Task t2) {

                return String.valueOf(t1.getContext()).compareTo(t2.getContext());
            }
        });

    }
    private void sortDscContext() {

        Collections.sort(taskList, new Comparator<Task>(){

            public int compare(Task t1, Task t2) {

                return String.valueOf(t2.getContext()).compareTo(t1.getContext());
            }
        });

    }

private void sortAscTime() {

        Collections.sort(taskList, new Comparator<Task>(){

            public int compare(Task t1, Task t2) {

                return String.valueOf(t1.getCreationTime()).compareTo(t2.getCreationTime());
            }
        });

    }
    private void sortDscTime() {

        Collections.sort(taskList, new Comparator<Task>(){

            public int compare(Task t1, Task t2) {

                return String.valueOf(t2.getCreationTime()).compareTo(t1.getCreationTime());
            }
        });

    }

    private void deleteTask() {
        System.out.println("Enter task # to delete: ");
        String userInput = input.nextLine();
        int choice = Integer.parseInt(userInput);
        taskList.remove(choice);
    }

    public void commandHeader() {
        System.out.println("_____________________________________________________________________________");
        System.out.println("Commands: a(add) | d(delete) | p(priority) | c(context) | t(time) | q(quit)");
        System.out.println("_____________________________________________________________________________");
    }


//    TODO make this method listen for a key press instead of needing the user to press Enter after
    public void menuOptions() {
        Scanner input = new Scanner(System.in);
        char userInput = input.next().charAt(0);
        switch (userInput) {
            case 'a':
                addTask();
                break;

            case 'd':
                deleteTask();
                break;

            case 'p':
                sortAscPriority();
                break;

            case 'P':
                sortDscPriority();
                break;

            case 'c':
                sortAscContext();
                break;

            case 'C':
                sortDscContext();
                break;

            case 't':
                sortAscTime();
                break;

            case 'T':
                sortDscTime();
                break;

            case 'q':
                runState = false;
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}