package com.techelevator;

public class BankAccount extends PointOfSale {
    private String accountNumber;
    public BankAccount(String accountNumber, double balanceAfterUserInput) {
        super(balanceAfterUserInput);
        this.accountNumber = accountNumber;
    }
    public double balanceAfterPurchase(double balanceAfterUserInput, double balanceAfterPurchase) {
        balanceAfterPurchase = balanceAfterUserInput - getPrice();
        return balanceAfterPurchase;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
