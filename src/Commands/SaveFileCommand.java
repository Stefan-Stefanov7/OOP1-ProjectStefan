package Commands;

public class SaveFileCommand implements Command{
    @Override
    public void execute()
    {
        System.out.println("File saved succesfully");
    }
}