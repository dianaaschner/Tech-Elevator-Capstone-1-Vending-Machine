package com.techelevator;

public class BankAccount extends PointOfSale {
    public String accountNumber;
    public double accountBalance;
    public PointOfSale bankAccount = new PointOfSale();

    public BankAccount() {

    }

    public BankAccount(String accountNumber, double balanceAfterUserInput) {
        super(balanceAfterUserInput);
        this.accountNumber = accountNumber;
    }
    public double balanceAfterPurchase(double balanceAfterUserInput, double balanceAfterPurchase) {
        balanceAfterPurchase = balanceAfterUserInput - getPrice();
        return balanceAfterPurchase;
    }


    public double getWithdrawal(){
        if (getPrice() < accountBalance) {
            accountBalance -= getPrice();
            return accountBalance;
        }else{
            System.out.println("Insufficient Funds. Your account balance is: " + accountBalance);
            return accountBalance;
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {

        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
