import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * This class defines the data structure of a task object. It is to be instantiated
 * and used within the TaskFactory class.
 */
class Task {

    private String summary;
    private String priority;
    private String context;
    private String creationTime;

    /**
     * This constructor is used when the program is running and creates a new task
     *
     * @param summary  Contains the full task summary text String
     * @param priority Contains a numerical String value of between 1-3
     * @param context  Contains a String context where the task will be executed.
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
     *
     * @param summary      Contains the full task summary text String
     * @param priority     Contains a numerical String value of between 1-3
     * @param context      Contains a String context where the task will be executed.
     * @param creationTime Accepts a String from the save file with the date/time which
     *                     overrides creation time stamping.
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

