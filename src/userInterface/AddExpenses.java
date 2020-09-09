package userInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/*
    Add Expenses Component
 */
public class AddExpenses extends JPanel {

    private JLabel rentLabel, loansLabel, foodLabel, leisureLabel, othersLabel;
    private JTextField rentTextField, loansTextField, foodTextField, leisureTextField, othersTextField;

    public AddExpenses() {

        this.setBackground(Color.yellow);

        rentLabel = new JLabel("Rent :");
        loansLabel = new JLabel("Loans :");
        foodLabel = new JLabel("Food :");
        leisureLabel = new JLabel("Leisure :");
        othersLabel = new JLabel("Others :");

        rentTextField = new JTextField(10);
        loansTextField = new JTextField(10);
        foodTextField = new JTextField(10);
        leisureTextField = new JTextField(10);
        othersTextField = new JTextField(10);

        this.setLayout(new MigLayout());

        this.add(rentLabel);
        this.add(rentTextField, "wrap");
        this.add(loansLabel);
        this.add(loansTextField, "wrap");
        this.add(foodLabel);
        this.add(foodTextField, "wrap");
        this.add(leisureLabel);
        this.add(leisureTextField, "wrap");
        this.add(othersLabel);
        this.add(othersTextField, "wrap");
    }
}

