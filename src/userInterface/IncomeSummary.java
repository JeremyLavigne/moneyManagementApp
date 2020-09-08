package userInterface;

import javax.swing.*;
import java.awt.*;

/*
    Income Summary Component
 */
public class IncomeSummary extends JPanel {

    private JLabel textInfo;

    public IncomeSummary() {
        textInfo = new JLabel();
        textInfo.setText("You are in the balance Summary");

        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.blue);

        this.add(textInfo);
    }
}
