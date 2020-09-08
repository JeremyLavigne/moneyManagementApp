package userInterface;

import javax.swing.*;

/*
    Frame for application, default size : 1000*800, not responsize (yet)
 */
public class AppWindow extends JFrame {

    /*
        constructor : title, size and get Layout/content from others classes (insertContainers methods)
     */
    public AppWindow() {
        this.setTitle("Will I be rich next year?");
        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main Jpanel, ..
        JPanel mainPane = new JPanel();
        // .. should 'receive' others one ..
        this.insertContainers(mainPane);

        // and be added to the frame
        this.add(mainPane);

        // Menu is treated separetely
        this.setJMenuBar(new Navbar());
    }

    /*
        Basic run method
     */
    public void run() {
        this.setVisible(true);
    }


    /*
        Use BoxLayout to organise the 5 parts of the layout
     */
    private void insertContainers(JPanel mainPane) {

        // Set Boxes
        Box topBox = Box.createHorizontalBox();
        topBox.add(new OutcomeSummary());
        topBox.add(new BalanceSummary());
        topBox.add(new IncomeSummary());

        Box bottomBox = Box.createHorizontalBox();
        bottomBox.add(new AddOutcome());
        bottomBox.add(new AddIncome());

        Box mainBox = Box.createVerticalBox();
        mainBox.add(topBox);
        mainBox.add(bottomBox);

        // Add it to mainPane
        mainPane.add(mainBox);

    }
}
