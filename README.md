# tasko

Tasko is a command line todo app. 

### Features

* Add tasks, delete, rename tasks
* Sort tasks by priority, context, and date added.
* Save task list to file and recall on startup.

### What was learned

* OOP basics. The Task class is an example of:
  * An object with attributes
  * Usage of a constructor that takes some values
  * Implementation of a secondary constructor that overrides the first. This is
  used when loading data from a file.
  * Getter/Setter methods
  
* File I/O
  * Reading/writing
  * Exception handling
  * Implementing tab delimited formatting
  * Check if the file already exists before reading
  
* OOP data security/scope
  * Using encapsulation and private signatures to avoid exposing program data

### Challenges encountered/solved

Sorting an entire array full of Task objects by certain selected field values in the contained Task object.

**Solution:**
```
    private void sortAscPriority() {

        taskList.sort((t1, t2) -> String.valueOf(t1.getPriority()).compareTo(t2.getPriority()));

    }
```