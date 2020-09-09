package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/*
    Add Expenses Component
 */
public class AddExpenses extends JPanel {

    private Balance appBalance;


    public AddExpenses(Balance balance) {

        this.appBalance = balance;

        this.setBackground(Color.yellow);

        this.setLayout(new MigLayout());

        this.add(new AddMovementLine("Rent", appBalance, false), "wrap");
        this.add(new AddMovementLine("Loans", appBalance, false), "wrap");
        this.add(new AddMovementLine("Food", appBalance, false), "wrap");
        this.add(new AddMovementLine("Leisure", appBalance, false), "wrap");
        this.add(new AddMovementLine("Others", appBalance, false), "wrap");
    }
}

