package userInterface;

import javax.swing.*;
import java.awt.*;


public class AppWindow extends JFrame {


    // 6 containers
    private JPanel navbar, outcomeSummary, addOutcome, incomeSummary, addIncome, balanceSummary;


    public AppWindow() {
        this.setTitle("Will I be rich next year?");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // include container inside frame
        this.insertContainers();

    }

    private void insertContainers() {
        // create some usefuls containers
        JPanel topPane = new JPanel();
        topPane.setMinimumSize(new Dimension(800, 200));
        topPane.setPreferredSize(new Dimension(800, 200));

        JPanel topBottomPane = new JPanel();
        topBottomPane.setPreferredSize(new Dimension(800, 150));

        JPanel topLeftPane = new JPanel();
        topLeftPane.setPreferredSize(new Dimension(500, 150));

        JPanel bottomPane = new JPanel();
        bottomPane.setPreferredSize(new Dimension(800, 400));

        // Navbar
        navbar = new JPanel();
        navbar.setBackground(Color.red);
        navbar.setPreferredSize(new Dimension(800, 50));

        // Balance Summary
        balanceSummary = new JPanel();
        balanceSummary.setBackground(Color.black);
        balanceSummary.setPreferredSize(new Dimension(200, 150));

        // Outcome Summary
        outcomeSummary = new JPanel();
        outcomeSummary.setBackground(Color.orange);
        outcomeSummary.setPreferredSize(new Dimension(300, 150));

        // Add Outcome
        addOutcome = new JPanel();
        addOutcome.setBackground(Color.blue);
        addOutcome.setPreferredSize(new Dimension(400, 400));

        // Income Summary
        incomeSummary = new JPanel();
        incomeSummary.setBackground(Color.yellow);
        incomeSummary.setPreferredSize(new Dimension(300, 150));

        // Add Outcome
        addIncome = new JPanel();
        addIncome.setBackground(Color.green);
        addIncome.setPreferredSize(new Dimension(400, 400));

        // add text area to panel
        topLeftPane.add(new JSplitPane(SwingConstants.VERTICAL, outcomeSummary, balanceSummary));
        topBottomPane.add(new JSplitPane(SwingConstants.VERTICAL, topLeftPane, incomeSummary));
        topPane.add(new JSplitPane(SwingConstants.HORIZONTAL, navbar, topBottomPane));
        bottomPane.add(new JSplitPane(SwingConstants.VERTICAL, addOutcome, addIncome));

        // create a splitpane
        JSplitPane sl = new JSplitPane(SwingConstants.HORIZONTAL, topPane, bottomPane);

        // add panel
        this.add(sl);

        //pan.setBackground(Color.blue);
        //this.add(pan);
        //this.getContentPane().add(pan);
    }

    public void run() {
        this.setVisible(true);
    }

}
