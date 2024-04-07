package Menus;

import Commands.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TerminalMenu {
    private final Map<String, Command> mainMenuOptions = new HashMap<>();
    private final Scanner scanner;

    public TerminalMenu() {
        scanner = new Scanner(System.in);
        mainMenuOptions.put("open", new OpenFileCommand());
        mainMenuOptions.put("close", new CloseFileCommand());
        mainMenuOptions.put("save", new SaveFileCommand());
        mainMenuOptions.put("saveas", new SaveAsFileCommand());
        mainMenuOptions.put("help", new HelpCommand());
    }

    public void run() {
        System.out.println("Terminal access:");

        String userInput;
        do {
            displayMainMenu();
            userInput = scanner.nextLine().trim().toLowerCase();
            if (mainMenuOptions.containsKey(userInput)) {
                mainMenuOptions.get(userInput).execute();
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        } while (!userInput.equals("exit"));
    }

    private void displayMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Open");
        System.out.println("2. Close");
        System.out.println("3. Save");
        System.out.println("4. Save As");
        System.out.println("5. Help");
        System.out.println("Type 'exit' to quit.");
        System.out.print("Enter your choice: ");
    }
}