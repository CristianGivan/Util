import java.util.ArrayList;
import java.util.List;


public class Menu {

    public static void getMenu(int menuNumber) {

        List<String> menuList = getMenuList(menuNumber);

        System.out.println("Select from 0 to " + (menuList.size() - 1) + " from the to options: \n");
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(typeInPrefix(i) + menuList.get(i));
        }
    }

    public static String getMenuLine(int menuNumber, int menuLine) {
        String line = "";
        List<String> menuList = getMenuList(menuNumber);
        line = menuList.get(menuLine);
        return line;
    }

    public static List<String> getMenuList(int menuNumber) {

        List<String> menuList = new ArrayList<>();
        switch (menuNumber) {
            case 1:
                menuList = mainMenu();
                break;
            case 2:
                menuList = Menu1();
                break;
            case 3:
                menuList = Menu2();
                break;
            default:
                break;
        }
        return menuList;
    }

    public static String typeInPrefix(int index) {
        return "Type in " + index + " to ";
    }

    public static List<String> mainMenu() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("exit");
        mainMenu.add("");

        return mainMenu;
    }

    public static List<String> Menu1() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("exit this menu");
        mainMenu.add("");
        return mainMenu;
    }
    public static List<String> Menu2() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("exit this menu");
        mainMenu.add("");
        return mainMenu;
    }
    public static List<String> Menu3() {
        List<String> mainMenu = new ArrayList<>();
        mainMenu.add("exit this menu");
        mainMenu.add("");
        return mainMenu;
    }
}
