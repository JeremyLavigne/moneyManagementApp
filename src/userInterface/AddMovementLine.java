package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
    Represent A line in Add Income / Add Expense
 */
public class AddMovementLine extends JPanel {

    public AddMovementLine(String title, Balance appBalance, boolean isPositive) {

        JLabel titleLabel = new JLabel(title + " :");
        JLabel confirmationLabel = new JLabel();

        JTextField textField = new JTextField(10);

        JButton modifyButton =  new JButton("Modify"); // Should appear when save is clicked
        JButton saveButton = new JButton("Save");
        modifyButton.setEnabled(false);

        saveButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                confirmationLabel.setText(textField.getText());

                // Get amount and check if expense or income
                int amount = Integer.valueOf(textField.getText());
                if (!isPositive) {
                    amount *= -1;
                }

                // Add it to the main balance
                appBalance.addMovement(title, amount);

                // Update display
                textField.setText("");
                textField.setEditable(false);
                saveButton.setEnabled(false);
                modifyButton.setEnabled(true);
            }
        });

        modifyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                confirmationLabel.setText("");

                // Remove it to the main balance
                appBalance.removeMovement(title);

                // Update display
                textField.setText("");
                textField.setEditable(true);
                saveButton.setEnabled(true);
                modifyButton.setEnabled(false);
            }
        });


        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout());

        this.add(titleLabel);
        this.add(textField);
        this.add(saveButton);
        this.add(modifyButton);
        this.add(confirmationLabel);

    }

}
