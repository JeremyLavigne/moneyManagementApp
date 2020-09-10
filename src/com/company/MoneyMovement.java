package com.company;

/*
    Represent one expense or one income entry
 */

public class MoneyMovement {
    private int amount;
    private String label;
    // private Date date; //-  Date not used right now

    public MoneyMovement(String label, int amount) {
        this.amount = amount;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "MoneyMovement{" +
                "amount=" + amount +
                ", label='" + label + '\'' +
                '}';
    }
}
