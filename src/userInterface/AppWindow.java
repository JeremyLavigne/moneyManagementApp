package userInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/*
    Frame for application, default size : 1000*800, not responsive (yet?)
 */
public class AppWindow extends JFrame {

    /*
        constructor : title, size and layout
     */
    public AppWindow() {
        this.setTitle("Will I be rich next year?");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MigLayout layout = new MigLayout();
        JPanel mainPane = new JPanel(layout);
        mainPane.add(new ExpensesSummary(), "cell 0 0 4 1, width 300:400:500, height 200:300:400");
        mainPane.add(new BalanceSummary(), "cell 4 0 2 1, width 200:200:200, height 200:300:400");
        mainPane.add(new IncomeSummary(), "cell 6 0 4 1, width 300:400:500, height 200:300:400");
        mainPane.add(new AddExpenses(), "cell 0 1 5 2, width 400:500:600, height 400:500:600");
        mainPane.add(new AddIncome(), "cell 5 1 5 2, width 400:500:600, height 400:500:600");

        this.add(mainPane);

    }

    /*
        Basic run method
     */
    public void run() {
        this.setVisible(true);
    }

}
