package com.company;

import java.util.ArrayList;

/*
    Balance contains all money movements (should change name now) and the the theoritical amount for next year
 */
public class Balance {

    private int totalNextYear; // Represent amount of money in 12 months
    private ArrayList<MoneyMovement> movements; // List of all movements - Not so useful right now

    /*
        constructor, no parameters required
     */
    public Balance() {
        this.totalNextYear = 0;
        this.movements = new ArrayList<>();
    }

    public int getTotalNextYear() {
        return totalNextYear;
    }

    /*
        Add monthly money Movement - update total
     */
    public void addMovement(String label, int amount) {
        movements.add(new MoneyMovement(label, amount));
        totalNextYear += amount * 12;
    }

    /*
        Add one time money Movement - update total
     */
    public void addOneTimeMovement(String label, int amount) {
        movements.add(new MoneyMovement(label, amount));
        totalNextYear += amount;
    }

    /*
        Remove money Movement - update total
     */
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
