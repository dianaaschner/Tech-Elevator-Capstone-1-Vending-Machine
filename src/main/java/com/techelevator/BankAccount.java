package com.techelevator;

public class BankAccount extends Money {
    private String accountNumber;
    public BankAccount(double userMoneyInput, String accountNumber, double vendingMachineBalance) {
        super(userMoneyInput, vendingMachineBalance);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
