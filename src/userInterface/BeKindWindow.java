package userInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/*
    Message poping up to signifiy that this app is only a "try", a begginer's work
 */
public class BeKindWindow extends JFrame {

    public BeKindWindow() {
        this.setTitle("Welcome!");
        this.setSize(300, 150);
        this.setLocationRelativeTo(null);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel message = new JPanel(new MigLayout());
        JLabel welcomeMsg = new JLabel("Please be kind, this 'app' is... modest!");
        JLabel welcomeMsg2 = new JLabel("Do not expect to much!");

        message.add(welcomeMsg, "wrap");
        message.add(welcomeMsg2);

        this.setLayout(new MigLayout());
        this.add(message, "align center");

    }

    /*
        Basic run method
     */
    public void run() {
        this.setVisible(true);
    }

}
