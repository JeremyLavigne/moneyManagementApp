package userInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/*
    Outcome Summary Component
 */
public class ExpensesSummary extends JPanel {

    private JLabel title, nextTitle, next1Field, next2Field, next3Field;


    public ExpensesSummary() {

        this.setBackground(Color.orange);

        title = new JLabel("Expenses Summary");
        nextTitle = new JLabel("Next expenses :");
        next1Field = new JLabel("->");
        next2Field = new JLabel("->");
        next3Field = new JLabel("->");

        this.setLayout(new MigLayout());

        this.add(title, "wrap");
        this.add(nextTitle, "wrap");
        this.add(next1Field, "wrap");
        this.add(next2Field, "wrap");
        this.add(next3Field, "wrap");

    }
}