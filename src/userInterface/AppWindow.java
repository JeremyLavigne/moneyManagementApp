package userInterface;

import com.company.Balance;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/*
    Frame for application, default size : 800*600, not really responsive (yet?)
 */
public class AppWindow extends JFrame {

    private Balance appBalance;

    /*
        constructor : title, size and layout
     */
    public AppWindow(Balance balance) {

        appBalance = balance;

        this.setTitle("Will I be rich next year?");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // --------------------------------------- Layout --------------------------------
        this.setLayout(new MigLayout());

        this.add(new BalanceSummary(appBalance), "cell 0 0 2 1, width 600:800:, height 100:200:");
        this.add(new AddExpenses(appBalance), "cell 0 1 1 2, width 300:400:, height 400:400:");
        this.add(new AddIncome(appBalance), "cell 1 1 1 2, width 300:400:, height 400:400:");

    }

    /*
        Basic run method
     */
    public void run() {
        this.setVisible(true);
    }

}
