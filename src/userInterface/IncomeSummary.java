package userInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/*
    Income Summary Component
 */
public class IncomeSummary extends JPanel {

    private JLabel title, nextTitle, next1Field;

    public IncomeSummary() {

        this.setBackground(Color.blue);

        title = new JLabel("Income Summary");
        nextTitle = new JLabel("Next income :");
        next1Field = new JLabel("->");

        this.setLayout(new MigLayout());

        this.add(title, "wrap");
        this.add(nextTitle, "wrap");
        this.add(next1Field, "wrap");
    }
}
