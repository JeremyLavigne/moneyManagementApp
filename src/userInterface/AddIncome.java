package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;


/*
    Add income Component
 */
public class AddIncome extends JPanel {

    public AddIncome(Balance appBalance) {

        //this.setBackground(Color.green);

        JLabel title = new JLabel("Monthly Income");

        JPanel oneTimeIncome = new AddMovementLine("Savings", appBalance, true);
        oneTimeIncome.setBorder(new MatteBorder(1, 0, 0, 0, Color.BLACK));

        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout("", "[grow]", "[]20[][][][]"));

        this.add(title, "wrap, align center");
        this.add(new AddMovementLine("Salary 1", appBalance, true), "wrap");
        this.add(new AddMovementLine("Salary 2", appBalance, true), "wrap");
        this.add(new AddMovementLine("Others", appBalance, true), "wrap");
        this.add(oneTimeIncome);

    }
}
