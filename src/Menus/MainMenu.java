package Menus;

import Commands.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {
    private final Map<String, Command> menuOptions = new HashMap<>();
    private final Scanner scanner;

    public MainMenu() {
        scanner = new Scanner(System.in);
        menuOptions.put("1", new ImportCommand());
        menuOptions.put("2", new ShowtablesCommand());
        menuOptions.put("3", new DescribeCommand());
        menuOptions.put("4", new PrintCommand());
        menuOptions.put("5", new ExportCommand());
        menuOptions.put("6", new SelectCommand());
        menuOptions.put("7", new AddColumnCommand());
        menuOptions.put("8", new UpdateCommand());
        menuOptions.put("9", new DeleteCommand());
        menuOptions.put("10", new InsertCommand());
        menuOptions.put("11", new InnerJoinCommand());
    }

    public void run() {
        String userInput;
        do {
            displayMenu();
            userInput = scanner.nextLine().trim();
            if (menuOptions.containsKey(userInput)) {
                menuOptions.get(userInput).execute();
            } else if (!userInput.equalsIgnoreCase("exit")) {
                System.out.println("Invalid option. Please try again.");
            }
        } while (!userInput.equalsIgnoreCase("exit"));
    }

    private void displayMenu() {
        System.out.println("1. import <file name>");
        System.out.println("2. showtables");
        System.out.println("3. describe <name>");
        System.out.println("4. print <name>");
        System.out.println("5. export <name> <file name>");
        System.out.println("6. select <column-n> <value> <table name>");
        System.out.println("7. addcolumn <table name> <column name> <column type>");
        System.out.print("8. update <table name> <search column n> <search value> <target column n> <target value>");
        System.out.println("9. delete <table name> <search column n> <search value>");
        System.out.println("10. insert <table name> <column 1> ... <column n>");
        System.out.println("11. innerjoin <table 1> <column n1> <table 2> <column n2>");
        System.out.println("Please select your choice:");
    }
}