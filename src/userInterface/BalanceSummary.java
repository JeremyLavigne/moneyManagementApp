package userInterface;

import javax.swing.*;
import java.awt.*;

/*
    Balance Summary Component
 */
public class BalanceSummary extends JPanel {

    private JLabel textInfo;

    public BalanceSummary() {
        textInfo = new JLabel();
        textInfo.setText("You are in the balance Summary");

        this.setPreferredSize(new Dimension(200, 300));
        this.setBackground(Color.black);


        this.add(textInfo);
    }
}
