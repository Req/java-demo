
/*
    A TODO list file will look like this

    - Wash dishes
    * Code java
    - Eat lunch
    - Drink afternoon coffe

 */

import java.nio.file.Files;
import java.nio.file.Path;

public class TodoList {
    private Path pathToFile;
    private String[] todos;

    public TodoList(String pathToFile) {
        this.pathToFile = Path.of(pathToFile); // Create Path to file

        // Read in the TODOS from the file
        // If file exists, read it in and save the lines of the file into "todos"

        if (!Files.exists(this.pathToFile)) {
            // If it does not exist, save the todos as an empty array of strings
        }
    }

}
