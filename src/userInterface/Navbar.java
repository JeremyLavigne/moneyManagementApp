package userInterface;

import javax.swing.*;

/*
    Classic Menu bar, empty for now

    See some example / help here :
    https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
 */

public class Navbar extends JMenuBar {

    private JMenuBar menuBar;
    private JMenu menu, submenu;
    private JMenuItem menuItem1, menuItem2, menuItem3;

    public Navbar() {
        menuBar = new JMenuBar();
        menu = new JMenu("App Menu");

        menuItem1 = new JMenuItem("Menu item1");
        menuItem2 = new JMenuItem("Menu item2");
        menuItem3 = new JMenuItem("Menu item3");

        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);

        menuBar.add(menu);

        this.add(menuBar);
    }
}
