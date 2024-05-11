package Commands;
import java.util.Scanner;
public class CloseFileCommand implements Command {

    @Override
    public void execute() {
        try {
            Scanner fileScanner = OpenFileCommand.getFileScanner();
            if (fileScanner.hasNext() == false) {
                fileScanner.close();
                System.out.println("File closed successfully.");
            }
        }
        catch(Exception e)
        {
            System.out.println("No file is currently open.");
        }
    }
}