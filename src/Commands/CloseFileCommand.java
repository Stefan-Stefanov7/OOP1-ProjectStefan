package Commands;

public class CloseFileCommand implements Command{
    @Override
    public void execute()
    {
        System.out.println("File closed");
    }
}
