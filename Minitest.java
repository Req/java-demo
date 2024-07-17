import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;

public class Minitest {

    public static void main(String[] args) throws Exception {

        // Create a Path that points to a file
        Path file = Path.of("/tmp/java-demo.txt");

        // If that file does not exist, create it
        if (Files.exists(file)) {
            System.out.println("File exists");
        } else {
            System.out.println("File does not exist :(((");
            Files.createFile(file);
        }

        // Read the file in as a String and print out the contents
        String s = Files.readString(file);
        System.out.println(s);

        // Every three seconds, write something into the file
        int counter = 0;
        while (true) {
            s = s + "NEW CONTENT " + ++counter + "  \n";
            Files.writeString(file, s);             // replace the contents of the file
            TimeUnit.SECONDS.sleep(3);      // make the program stop for 3s
            System.out.println("I slept very well :)");
        }
        // Monitor a file for changes, printing out the last 3 lines when it changes
        // `$ watch tail -n 3 /tmp/java-demo.txt`

        // 3 minute MINI EXERCISE
        // - Make a counter that adds a number after the "NEW CONTENT"
        // - Adding to the file "NEW CONTENT 1\n"
        // - Adding to the file "NEW CONTENT 2\n"
        // - Adding to the file "NEW CONTENT 3\n"
        // - Adding to the file "NEW CONTENT ...\n"
        // - And so on


    }

}
