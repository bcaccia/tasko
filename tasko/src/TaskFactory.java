import java.io.*;
import java.util.*;

/**
 * This class contains most of the methods and logic for the program.
 */
class TaskFactory {

    private final Scanner input;
    private boolean runState = true;
    private String sortState = "t";
    private final ArrayList<Task> taskList = new ArrayList<>();
    private static final String FILENAME = "taskList.csv";

    /**
     * Constructor
     */
    public TaskFactory() {
        input = new Scanner(System.in);
    }

    /**
     * Adds a task to the current instances taskList variable
     */
    private void addTask() {

        String taskSummary;
        String taskPriority;
        String taskContext;
        boolean runState = true;

        System.out.println("Enter task: ");
        taskSummary = input.nextLine();

        System.out.println("Enter a priority #1-3: ");
        taskPriority = input.nextLine().toLowerCase();

        // Verifies that only a number of 1-3 is being entered for the priority.
        while (runState) {
            if (taskPriority.equalsIgnoreCase("1") ||
                    taskPriority.equalsIgnoreCase("2") ||
                    taskPriority.equalsIgnoreCase("3")) {

                runState = false;

            } else {
                System.out.println("Only numbers allowed! Try again: ");
                taskPriority = input.nextLine().toLowerCase();
            }
        }

        System.out.println("Enter context: ");
        taskContext = input.nextLine();


        Task newTask = new Task(taskSummary, taskPriority, taskContext);

        taskList.add(newTask);
    }

    /**
     * This is the getter for the instances runState variable. When the user chooses to quit the program
     * it is set to false which causes the main() loop to quit
     *
     * @return a boolean
     */
    public boolean isRunState() {
        return runState;
    }

    /**
     * Prints out the contents of the taskList array to the screen
     */
    public void viewTasks() {
        switch (sortState) {
            case "p":
                sortAscPriority();
                break;
            case "P":
                sortDscPriority();
                break;
            case "c":
                sortAscContext();
                break;
            case "C":
                sortDscContext();
                break;
            case "t":
                sortAscTime();
                break;
            case "T":
                sortDscTime();
                break;
        }


        int i = 0;
        for (Task x :
                taskList) {
            System.out.println(i + " | " + x.toString());
            i++;
        }

    }

    /**
     * Sorts the Priority in a ascending order
     */
    private void sortAscPriority() {

        taskList.sort((t1, t2) -> String.valueOf(t1.getPriority()).compareTo(t2.getPriority()));

    }

    /**
     * Sorts the Priority in a descending order
     */
    private void sortDscPriority() {

        taskList.sort((t1, t2) -> String.valueOf(t2.getPriority()).compareTo(t1.getPriority()));

    }

    /**
     * Sorts the Context in a ascending order
     */
    private void sortAscContext() {

        taskList.sort((t1, t2) -> String.valueOf(t1.getContext()).compareTo(t2.getContext()));

    }

    /**
     * Sorts the Context in a descending order
     */
    private void sortDscContext() {

        taskList.sort((t1, t2) -> String.valueOf(t2.getContext()).compareTo(t1.getContext()));

    }

    /**
     * Sorts the Time in a ascending order
     */
    private void sortAscTime() {

        taskList.sort((t1, t2) -> String.valueOf(t1.getCreationTime()).compareTo(t2.getCreationTime()));

    }

    /**
     * Sorts the Time in a descending order
     */
    private void sortDscTime() {

        taskList.sort((t1, t2) -> String.valueOf(t2.getCreationTime()).compareTo(t1.getCreationTime()));

    }

    /**
     * Deletes an item from the taskList
     */
    private void deleteTask() {
        System.out.println("Enter task # to delete: ");
        String userInput = input.nextLine();
        int choice = Integer.parseInt(userInput);
        taskList.remove(choice);
    }

    /**
     * Prints the command header to the console
     */
    public void commandHeader() {
        System.out.println("_____________________________________________________________________________");
        System.out.println("Commands: a(add) | d(delete) | p(priority) | c(context) | t(time) | q(quit)");
        System.out.println("_____________________________________________________________________________");
    }

    /**
     * Executes the appropriate function based on the clients selection
     */
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
                sortState = "p";
                sortAscPriority();
                break;

            case 'P':
                sortState = "P";
                sortDscPriority();
                break;

            case 'c':
                sortState = "c";
                sortAscContext();
                break;

            case 'C':
                sortState = "C";
                sortDscContext();
                break;

            case 't':
                sortState = "t";
                sortAscTime();
                break;

            case 'T':
                sortState = "T";
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

    /**
     * Write the taskList to a .csv tab delimited format file
     */
    public void writeToFile() {
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);

            for (Task x :
                    taskList) {
                bw.write(x.getSummary() + "\t"
                        + x.getPriority() + "\t"
                        + x.getContext() + "\t"
                        + x.getCreationTime() + "\n");
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Read input from a tab delimited file and load individual tasks into a new
     * taskList array.
     */
    public void readFromFile() {
        BufferedReader br = null;
        File f = new File(".", FILENAME);
        String line;
        String splitBy = "\t";

        // Check if the file exists first. If it doesn't, continue on with the execution of the program.
        if (f.exists()) {
            try {

                br = new BufferedReader(new FileReader(FILENAME));


                while ((line = br.readLine()) != null) {

                    String[] rawTasks = line.split(splitBy);
                    Task tempTask = new Task(rawTasks[0], rawTasks[1], rawTasks[2], rawTasks[3]);
                    taskList.add(tempTask);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}