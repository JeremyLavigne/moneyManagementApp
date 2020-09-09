package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/*
    Frame for application, default size : 1000*800, not responsive (yet?)
 */
public class AppWindow extends JFrame {

    private Balance appBalance;

    /*
        constructor : title, size and layout
     */
    public AppWindow(Balance balance) {

        appBalance = balance;

        this.setTitle("Will I be rich next year?");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout());

        this.add(new BalanceSummary(appBalance), "cell 0 0 2 1, width 600:1000:, height 200:300:");
        this.add(new AddExpenses(appBalance), "cell 0 1 1 2, width 400:500:, height 400:500:");
        this.add(new AddIncome(appBalance), "cell 1 1 1 2, width 400:500:, height 400:500:");

    }

    /*
        Basic run method
     */
    public void run() {
        this.setVisible(true);
    }

}
