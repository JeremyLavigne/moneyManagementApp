package com.company;


/*
    Represent one expense or income
 */
public class MoneyMovement {
    private int amount;
    private String label;
    // private Date date;

    public MoneyMovement(String label, int amount) {
        this.amount = amount;
        this.label = label;
    }

    public int getAmount() {
        return amount;
    }

    public String getLabel() {
        return label;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "MoneyMovement{" +
                "amount=" + amount +
                ", label='" + label + '\'' +
                '}';
    }
}
