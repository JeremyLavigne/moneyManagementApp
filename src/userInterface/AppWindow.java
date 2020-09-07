package userInterface;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class AppWindow extends JFrame {

    public AppWindow() {
        this.setTitle("Will I be rich next year?");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pan = new JPanel();
        pan.setBackground(Color.ORANGE);

        this.setContentPane(pan);
        this.setVisible(true);
    }

}
