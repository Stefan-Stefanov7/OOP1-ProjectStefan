package Commands;
import java.io.FileWriter;
import java.util.Scanner;

public class SaveFileCommand implements Command{
    private String content;


    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void execute() {
        String fileName=new OpenFileCommand().getFileName();

        try (FileWriter fileWriter = new FileWriter(fileName,true)) {
            // NEEDS FIXING HERE
            fileWriter.write("\n" + content);
            fileWriter.close();

            System.out.println("File saved successfully!");
        } catch (Exception e) {
            System.out.println("Error: Unable to save file.");
        }
    }
}