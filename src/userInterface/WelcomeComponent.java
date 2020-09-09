package userInterface;

import javax.swing.*;
import java.awt.*;

/*
    Only welcome text, no logic part
 */
public class WelcomeComponent extends JPanel {

    public WelcomeComponent() {
        this.setBackground(Color.pink);

        JLabel welcome = new JLabel("Welcome");

        this.add(welcome);
    }
}
