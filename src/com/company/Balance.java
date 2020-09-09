package com.company;

import java.util.ArrayList;

/*
    Balance contains all money movements (should change name now) and the the theoritical amount for next year
 */
public class Balance {

    private int totalNextYear;
    private ArrayList<MoneyMovement> movements;

    public Balance() {
        this.totalNextYear = 0;
        this.movements = new ArrayList<>();
    }

    public int getTotalNextYear() { return totalNextYear; }


    // Add money movement
    public void addMovement(String label, int amount) {
        movements.add(new MoneyMovement(label, amount));
        totalNextYear += amount * 12;
    }



    @Override
    public String toString() {
        return "Balance{" +
                "total=" + totalNextYear +
                ", movements=" + movements +
                '}';
    }

}
