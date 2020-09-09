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

    public int getTotalNextYear() {
        return totalNextYear;
    }


    // Add money movement
    public void addMovement(String label, int amount) {
        movements.add(new MoneyMovement(label, amount));
        totalNextYear += amount * 12;
    }

    public void removeMovement(String label) {
        int indexOfLabel = 0;

        for (int i = 0; i < movements.size(); i++) {
            if (movements.get(i).getLabel().equals(label)){
                indexOfLabel = i;
            }
        }

        totalNextYear -= movements.get(indexOfLabel).getAmount() * 12;

        movements.remove(indexOfLabel);

    }


    @Override
    public String toString() {
        return "Balance{" +
                "total=" + totalNextYear +
                ", movements=" + movements +
                '}';
    }

}
