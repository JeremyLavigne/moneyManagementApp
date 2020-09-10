package com.company;

import userInterface.AppWindow;
import userInterface.BeKindWindow;

/*
    Global idea : Set your monthly expenses / income and see if you will be rich in a year.

    Objective : Become familiar with Java GUI and way to link Logic and UI parts.

    Own feedback : Feel I use classes as I use Components in React. Don't know if it is bad!

    Todo : Find an other way to update JLabel displaying the value of balance
      (now need to refresh it pressing a button)
 */
public class Main {

    public static void main(String[] args) {

        Balance myBalance = new Balance();
        AppWindow appWindow = new AppWindow(myBalance);
        BeKindWindow beKindWindow = new BeKindWindow();

        appWindow.run();
        beKindWindow.run();
    }
}
