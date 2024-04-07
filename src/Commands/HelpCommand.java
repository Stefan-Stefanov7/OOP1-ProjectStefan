package Commands;
import Menus.MainMenu;

public class HelpCommand implements Command{
    @Override
    public void execute()
    {
        System.out.println("Help menu:");
        MainMenu mainMenu = new MainMenu();
        mainMenu.run();
    }
}
