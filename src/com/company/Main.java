package com.company;

import userInterface.AppWindow;

/*
    Global idea : Set your monthly expenses / income and see if you will be rich in a year.

    Objective : Become familiar with Java GUI and way to link Logic and UI parts.

    Own feedback : Feel I use classes as I use Components in React. Don't know if it is bad!

    Todo : Find an other way to access/update the Balance inside UI
 */
public class Main {

    public static void main(String[] args) {

        Balance myBalance = new Balance();
        AppWindow appWindow = new AppWindow(myBalance);

        appWindow.run();
    }
}
