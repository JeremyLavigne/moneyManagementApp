package userInterface;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;


/*

    Classic Menu bar, empty for now

    See some example / help here :
    https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
 */

public class Navbar extends JMenuBar {

    private JMenuBar menuBar;
    private JMenu menu;

    public Navbar() {
        menuBar = new JMenuBar();
        menu = new JMenu("App Menu");

        menuBar.setBackground(Color.green);
        menuBar.add(menu);
    }
}
