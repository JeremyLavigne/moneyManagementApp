package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/*
    Balance Summary Component
 */
public class BalanceSummary extends JPanel {

    private Balance appBalance;
    private JLabel title, nextYearTitle, nextYearField;

    public BalanceSummary(Balance balance) {

        this.appBalance = balance;

        this.setBackground(Color.white);

        title = new JLabel("Balance");

        nextYearTitle = new JLabel("Next Year :");
        nextYearField = new JLabel(String.valueOf(appBalance.getTotalNextYear()));

        this.setLayout(new MigLayout());

        this.add(title, "wrap");

        this.add(nextYearTitle);
        this.add(nextYearField, "wrap");
    }
}
