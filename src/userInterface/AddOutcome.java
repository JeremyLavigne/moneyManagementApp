package userInterface;

import javax.swing.*;
import java.awt.*;

/*
    Add Outcome Component
 */
public class AddOutcome extends JPanel {

    private JLabel textInfo;

    public AddOutcome() {
        textInfo = new JLabel();
        textInfo.setText("You can add some outcome here");

        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.yellow);

        this.add(textInfo);
    }
}

