package com.company;

import java.util.ArrayList;

public class Balance {

    private int total;
    private ArrayList<MoneyMovement> movements;

    public Balance() {
        this.total = 0;
        this.movements = new ArrayList<>();
    }

    public ArrayList<MoneyMovement> getMovements() {
        return movements;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "total=" + total +
                ", movements=" + movements +
                '}';
    }
}
