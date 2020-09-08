package userInterface;

import javax.swing.*;
import java.awt.*;

/*
    Outcome Summary Component
 */
public class OutcomeSummary extends JPanel {

    private JLabel textInfo;

    public OutcomeSummary() {
        textInfo = new JLabel();
        textInfo.setText("You are in the outcome Summary");


        this.setPreferredSize(new Dimension(400, 300));
        this.setBackground(Color.orange);

        this.add(textInfo);
    }
}