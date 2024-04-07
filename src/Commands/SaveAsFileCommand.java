package Commands;

public class SaveAsFileCommand implements Command{
    @Override
    public void execute()
    {
        System.out.println("File saved as requested");
    }
}