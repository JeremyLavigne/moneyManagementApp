package userInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;


/*
    Add income Component
 */
public class AddIncome extends JPanel {

    private JLabel salary1Label, salary2Label, othersLabel;
    private JTextField salary1TextField, salary2TextField, othersTextField;

    public AddIncome() {

        this.setBackground(Color.green);

        salary1Label = new JLabel("Salary 1 :");
        salary2Label = new JLabel("Salary 2 :");
        othersLabel = new JLabel("Others :");

        salary1TextField = new JTextField(10);
        salary2TextField = new JTextField(10);
        othersTextField = new JTextField(10);

        this.setLayout(new MigLayout());

        this.add(salary1Label);
        this.add(salary1TextField, "wrap");
        this.add(salary2Label);
        this.add(salary2TextField, "wrap");
        this.add(othersLabel);
        this.add(othersTextField, "wrap");
    }
}
