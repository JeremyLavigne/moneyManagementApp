package userInterface;

import javax.swing.*;
import java.awt.*;


/*
    Add income Component
 */
public class AddIncome extends JPanel {

    private JLabel textInfo;

    public AddIncome() {
        textInfo = new JLabel();
        textInfo.setText("You can add some income here");

        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.green);

        this.add(textInfo);
    }
}
