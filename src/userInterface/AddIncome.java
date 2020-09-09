package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;


/*
    Add income Component
 */
public class AddIncome extends JPanel {

    private Balance appBalance;

    public AddIncome(Balance balance) {

        this.appBalance = balance;

        this.setBackground(Color.green);

        this.setLayout(new MigLayout());

        this.add(new AddMovementLine("Salary 1", appBalance, true), "wrap");
        this.add(new AddMovementLine("Salary 2", appBalance, true), "wrap");
        this.add(new AddMovementLine("Others", appBalance, true), "wrap");

    }
}
