package Commands;

public class AddColumnCommand implements Command{
    @Override
    public void execute()
    {
        System.out.println("Column added");
    }
}
