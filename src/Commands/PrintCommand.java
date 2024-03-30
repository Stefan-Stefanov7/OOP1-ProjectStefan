package Commands;

public class PrintCommand implements Command{
    @Override
    public void execute()
    {
        System.out.println("Printed");
    }
}
