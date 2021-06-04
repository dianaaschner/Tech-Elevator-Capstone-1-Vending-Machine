package com.techelevator;

public class Cash extends Money {
    private double changeOwed;
    private Object balanceAfterPurchase;

    public Cash(double userMoneyInput, double changeOwed, double balanceAfterUserInput, double vendingMachineBalance) {
        super(userMoneyInput, vendingMachineBalance, balanceAfterUserInput);
        this.changeOwed = changeOwed;
    }

    public double balanceAfterPurchase(double balanceAfterUserInput, double changeOwed, double balanceAfterPurchase) {
        balanceAfterPurchase = balanceAfterUserInput - getPrice();
        return balanceAfterPurchase;
    }

    public int[] getChangeOwed(double balanceAfterPurchase) {
        this.balanceAfterPurchase = balanceAfterPurchase;
       int countDimes = 0;
       int countNickles = 0;
        int countQuarters = 0;
        double changeOwedAfterDimes = 0;
        double changeOwedAfterNickles = 0;
        int[] change = new int[] { countDimes, countNickles, countQuarters };
      double changeOwedAfterQuarters = 0;
        while(changeOwed > 0.25) {
            countQuarters++;
             changeOwedAfterQuarters = changeOwed - ((countQuarters * 25) / 100);
        } while(changeOwedAfterQuarters > 0.10) {
            countDimes++;
            changeOwedAfterDimes = changeOwedAfterQuarters - ((countDimes * 10) / 100);
        } while(changeOwedAfterDimes > 0.05) {
            countNickles++;
            changeOwedAfterNickles = changeOwedAfterDimes - ((countNickles * 5) / 100);
        }
        return change;
    }

    public void setChangeOwed(double changeOwed) {
        this.changeOwed = changeOwed;
    }
}
