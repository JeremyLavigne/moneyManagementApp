package userInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/*
    Balance Summary Component
 */
public class BalanceSummary extends JPanel {

    private JLabel title, todayTitle, todayBalanceField, nextYearTitle, nextYearField;

    public BalanceSummary() {

        this.setBackground(Color.white);

        title = new JLabel("Balance");
        todayTitle = new JLabel("Today :");
        todayBalanceField = new JLabel("0");
        nextYearTitle = new JLabel("Next Year :");
        nextYearField = new JLabel("0");

        this.setLayout(new MigLayout());

        this.add(title, "wrap");
        this.add(todayTitle);
        this.add(todayBalanceField, "wrap");
        this.add(nextYearTitle);
        this.add(nextYearField, "wrap");
    }
}
