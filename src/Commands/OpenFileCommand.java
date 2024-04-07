package Commands;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFileCommand implements Command{
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name to open: ");
        String fileName = scanner.nextLine().trim();

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);
            System.out.println("File content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}

