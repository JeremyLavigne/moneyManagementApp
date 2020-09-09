package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Balance Summary Component
 */
public class BalanceSummary extends JPanel {

    public BalanceSummary(Balance balance) {

        Balance appBalance = balance;

        this.setBackground(Color.white);

        JLabel title = new JLabel("Balance");
        JLabel nextYearTitle = new JLabel("Next Year :");
        JLabel nextYearField = new JLabel();

        JButton calculateButton = new JButton("Will I be rich next year?");
        calculateButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                nextYearField.setText(String.valueOf(appBalance.getTotalNextYear())
                + ((appBalance.getTotalNextYear() > 0) ? " - Yes ! :)" : " - Apparently no... :("));
            }
        });


        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout());

        this.add(title, "wrap");
        this.add(nextYearTitle);
        this.add(calculateButton, "wrap");
        this.add(nextYearField, "wrap");
    }

}
