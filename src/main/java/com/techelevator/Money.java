package com.techelevator;

public class Money {
    double userMoneyInput;
    double vendingMachineBalance = 0;

    public Money(double userMoneyInput, double vendingMachineBalance) {
        this.userMoneyInput = userMoneyInput;
        this.vendingMachineBalance = vendingMachineBalance;
    }

    public double balanceAfterUserInput(double userMoneyInput, double vendingMachineBalance) {
        this.vendingMachineBalance = vendingMachineBalance;
        this.userMoneyInput = userMoneyInput;
        double balanceAfterUserInput = vendingMachineBalance + userMoneyInput;
        return balanceAfterUserInput;
    }

    public double getVendingMachineBalance() {

        return vendingMachineBalance;
    }

    public void setVendingMachineBalance(double vendingMachineBalance) {
        this.vendingMachineBalance = vendingMachineBalance;
    }

    public double getUserMoneyInput() {

        return userMoneyInput;
    }

    public void setUserMoneyInput(double userMoneyInput) {

        this.userMoneyInput = userMoneyInput;
    }
}
