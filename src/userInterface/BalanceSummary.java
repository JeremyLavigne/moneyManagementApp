package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Balance Summary Component
 */
public class BalanceSummary extends JPanel {

    public BalanceSummary(Balance appBalance) {

        this.setBorder(new MatteBorder(0, 0, 1, 0, Color.BLACK));

        //this.setBackground(Color.white);

        // Different label to display the final result
        JPanel nextYearField = new JPanel();
        JLabel nextYearTitle = new JLabel("Your capital in a year : ");
        nextYearTitle.setFont(new Font("Serif", Font.PLAIN, 14));

        JLabel nextYearCapital = new JLabel("?");
        nextYearCapital.setFont(new Font("Serif", Font.PLAIN, 19));

        JLabel nextYearComment = new JLabel();
        nextYearComment.setFont(new Font("Serif", Font.PLAIN, 19));

        // Set layout for the result part
        nextYearField.setLayout(new MigLayout());

        nextYearField.add(nextYearTitle);
        nextYearField.add(nextYearCapital, "wrap");
        nextYearField.add(nextYearComment, "align center");


        // Use a button to "refresh" the final result
        JButton calculateButton = new JButton("Will I be rich next year?");
        calculateButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                nextYearCapital.setText(String.valueOf(appBalance.getTotalNextYear()));
                nextYearComment.setText((
                        appBalance.getTotalNextYear() > 0) ?
                        "Yes ! :)" :
                        "No.. :(");
            }
        });


        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout("", "[grow]", "[grow][grow]"));

        this.add(calculateButton, "width 300:400, wrap, align center");
        this.add(nextYearField, "width 200:300, align center");
    }

}
