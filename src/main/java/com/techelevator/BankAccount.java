package com.techelevator;

public class BankAccount extends Money {
    private String accountNumber;
    public BankAccount(String accountNumber, double balanceAfterUserInput) {
        super(balanceAfterUserInput);
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
