package com.techelevator;

public class Money {
    double userMoneyInput;
    double vendingMachineBalance = 0;
    double balanceAfterUserInput;
    double price = 0;

    public Money(double userMoneyInput, double vendingMachineBalance, double balanceAfterUserInput) {
        this.userMoneyInput = userMoneyInput;
        this.vendingMachineBalance = vendingMachineBalance;
        this.balanceAfterUserInput = balanceAfterUserInput;
    }

    public double balanceAfterUserInput(double userMoneyInput, double vendingMachineBalance) {
        this.vendingMachineBalance = vendingMachineBalance;
        this.userMoneyInput = userMoneyInput;
        balanceAfterUserInput = vendingMachineBalance + userMoneyInput;
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
    public double getBalanceAfterUserInput() {
        return balanceAfterUserInput;
    }
    public void setBalanceAfterUserInput(double balanceAfterUserInput) {
        this.balanceAfterUserInput = balanceAfterUserInput;
    }
    public double getPrice() {
        return price;
    }
}
