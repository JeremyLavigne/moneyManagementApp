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

        JTextField textField = new JTextField(6);

        JButton modifyButton =  new JButton("Modify"); // Should appear when save is clicked
        JButton saveButton = new JButton("Save");
        modifyButton.setEnabled(false);

        saveButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                // Get textField value and check if it is not empty
                if (textField.getText().equals("")) {return;}

                // Limit at 7 characters
                int end = textField.getText().length();
                if (end > 6){end = 6;}
                String userInput = textField.getText().substring(0, end);

                // Get amount - only if number
                int amount;
                try {
                    amount = Integer.valueOf(userInput);
                } catch (NumberFormatException ev) {
                    System.out.println("not a number");
                    textField.setText("");
                    return;
                }

                // Display it
                confirmationLabel.setText(userInput);

                // Check if expenses or income
                if (!isPositive) {amount *= -1;}

                // Add it to the main balance
                // Special treatment for one time income
                if (title.equals("Savings")){
                    appBalance.addOneTimeMovement(title, amount);
                } else {
                    appBalance.addMovement(title, amount);
                }

                // Update display
                textField.setText("");
                textField.setEditable(false);
                saveButton.setEnabled(false);
                modifyButton.setEnabled(true);
            }
        });

        // Modify button just erase and let user do it again
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
        this.setLayout(new MigLayout("", "[100][100][80][80][80]", ""));

        this.add(titleLabel);
        this.add(textField);
        this.add(saveButton);
        this.add(modifyButton);
        this.add(confirmationLabel);

    }

}
