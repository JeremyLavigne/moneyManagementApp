package com.company;

import userInterface.AppWindow;

public class Main {

    public static void main(String[] args) {

        Balance myBalance = new Balance();
        AppWindow appWindow = new AppWindow(myBalance);

        appWindow.run();
    }
}
