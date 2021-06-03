package com.techelevator;

public class Cash extends Money {
    private double changeOwed;
    public Cash(double userMoneyInput, double changeOwed, double vendingMachineBalance) {
        super(userMoneyInput, vendingMachineBalance);
        this.changeOwed = changeOwed;
    }

    public double getChangeOwed() {
        return changeOwed;
    }

    public void setChangeOwed(double changeOwed) {
        this.changeOwed = changeOwed;
    }
}
