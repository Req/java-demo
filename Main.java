
// The main class will do the following operations
// Print main user interface into System.out
// Ask the user for operations to do

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Initialize TodoList


        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        // Start the "main loop"
        while (!userInput.equals("exit")) {
            menuView(); // Print the "user interface"
            // Ask the user what do they want to doooooo
            userInput = scanner.nextLine();

            if (userInput.equals("add")) {
                addTodoView(); // Add new TODO item
            }
            if (userInput.equals("list")) {
                listTodosView(); // List all TODO items
            }
            if (userInput.equals("check")) {
                markTodoItemAsDoneView(); // Mark TODO item as done
            }
        }
    }

    private static void markTodoItemAsDoneView() {
        System.out.println("");
        System.out.println("");
        System.out.println("List TODOs, then ask user to mark item as done");
        // Ask the user to select which one to mark as DONE
    }

    private static void listTodosView() {
        System.out.println("");
        System.out.println("");
        System.out.println("List TODOs");
    }

    private static void addTodoView() {
        System.out.println("");
        System.out.println("");
        System.out.println("Add TODO");
        // Ask the user for input
    }

    private static void menuView() {
        System.out.println("");
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println(" - Enter 'list' to list your TODOs");
        System.out.println(" - Enter 'add' to add a new TODO");
        System.out.println(" - Enter 'check' to mark a TODO as done ");
        System.out.println(" - Enter 'exit' to quite the program");
    }

}
