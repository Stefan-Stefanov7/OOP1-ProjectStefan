package Commands;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class OpenFileCommand implements Command {
    public static Scanner fileScanner;
    private static String fileName;


    public static String getFileName() {
        return fileName;
    }

    public static Scanner getFileScanner() {
        return fileScanner;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name to open: ");
        fileName = scanner.nextLine().trim();

        try {
            File file = new File(fileName);
            fileScanner = new Scanner(file);
            System.out.println("File content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

}