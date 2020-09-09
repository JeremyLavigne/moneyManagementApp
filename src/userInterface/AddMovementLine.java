package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/*
    Represent A line in Add Income / Expense
 */
public class AddMovementLine extends JPanel {

    private JLabel titleLabel, confirmationLabel;
    private JTextField textField;
    private JButton saveButton, modifyButton;
    private Balance appBalance;
    private boolean isPositive; // True if Income, false if Expenses

    public AddMovementLine(String title, Balance appBalance, boolean isPositive) {

        this.isPositive = isPositive;
        this.appBalance = appBalance; // Should not come like that - Stop thinking like React

        this.titleLabel = new JLabel(title + " :");
        this.confirmationLabel = new JLabel();

        this.textField = new JTextField(10);

        this.modifyButton =  new JButton("Modify"); // Should appear when save is clicked
        this.saveButton = new JButton("Save");

        modifyButton.setEnabled(false);
        saveButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                confirmationLabel.setText(textField.getText());
                appBalance.addMovement(title, Integer.valueOf(textField.getText()));
                textField.setText("");
                textField.setEditable(false);
                saveButton.setEnabled(false);
                modifyButton.setEnabled(true);
            }
        });

        this.setLayout(new MigLayout());

        this.add(titleLabel);
        this.add(textField);
        this.add(saveButton);
        this.add(modifyButton);
        this.add(confirmationLabel);

    }

}
