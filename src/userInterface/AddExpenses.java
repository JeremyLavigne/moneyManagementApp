package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;

/*
    Add Expenses Component
 */
public class AddExpenses extends JPanel {

    public AddExpenses(Balance appBalance) {

        //this.setBackground(Color.yellow);
        this.setBorder(new MatteBorder(0, 0, 0, 1, Color.BLACK));

        JLabel title = new JLabel("Monthly Expenses");

        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout("", "[grow]", "[]20[][][][][]"));

        this.add(title, "wrap, align center");
        this.add(new AddMovementLine("Rent", appBalance, false), "wrap");
        this.add(new AddMovementLine("Loans", appBalance, false), "wrap");
        this.add(new AddMovementLine("Food", appBalance, false), "wrap");
        this.add(new AddMovementLine("Leisure", appBalance, false), "wrap");
        this.add(new AddMovementLine("Others", appBalance, false), "wrap");
    }
}

