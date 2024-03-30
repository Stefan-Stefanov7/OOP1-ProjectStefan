package mainMenu;

import Commands.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mainMenu {
    private final Map<String, Command> menuOptions = new HashMap<>();
    private final Scanner scanner;

    public mainMenu() {
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
        System.out.println("import <file name>");
        System.out.println("showtables");
        System.out.println("describe <name>");
        System.out.println("print <name>");
        System.out.println("export <name> <file name>");
        System.out.println("select <column-n> <value> <table name>");
        System.out.println("addcolumn <table name> <column name> <column type>");
        System.out.print("update <table name> <search column n> <search value> <target column n> <target value>");
        System.out.println("delete <table name> <search column n> <search value>");
        System.out.println("insert <table name> <column 1> ... <column n>");
        System.out.println("innerjoin <table 1> <column n1> <table 2> <column n2>");
    }
}