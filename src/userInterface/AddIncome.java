package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;


/*
    Add income Component
 */
public class AddIncome extends JPanel {

    public AddIncome(Balance appBalance) {

        this.setBackground(Color.green);

        JLabel title = new JLabel("Monthly Income");

        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout());

        this.add(title, "wrap");
        this.add(new AddMovementLine("Salary 1", appBalance, true), "wrap");
        this.add(new AddMovementLine("Salary 2", appBalance, true), "wrap");
        this.add(new AddMovementLine("Others", appBalance, true), "wrap");

    }
}
