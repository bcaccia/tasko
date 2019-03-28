
class Main {

    public static void main(String[] args) {
        TaskFactory taskFactory = new TaskFactory();
        taskFactory.readFromFile();

        while (taskFactory.isRunState()) {
            taskFactory.commandHeader();
            taskFactory.viewTasks();
            taskFactory.menuOptions();
        }

        taskFactory.writeToFile();

    }

}
