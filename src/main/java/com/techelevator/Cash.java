package com.techelevator;

import com.techelevator.view.Menu;
import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cash extends PointOfSale {
    private double changeOwed;
    private Object balanceAfterPurchase;

   // private PrintWriter out;
 //   String cashInserted = null;
   // Scanner cashInput = new Scanner(System.in.toString());


    public Cash(double balanceAfterUserInput, double balanceAfterPurchase) {
        super(balanceAfterUserInput);
        this.balanceAfterPurchase = balanceAfterPurchase;
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
        if(balanceAfterPurchase > 0.25) {
            countQuarters++;
             changeOwedAfterQuarters += balanceAfterPurchase - ((countQuarters * 25) / 100);
        } if(changeOwedAfterQuarters > 0.10) {
            countDimes++;
            changeOwedAfterDimes += changeOwedAfterQuarters - ((countDimes * 10) / 100);
        } if(changeOwedAfterDimes > 0.05) {
            countNickles++;
            changeOwedAfterNickles += changeOwedAfterDimes - ((countNickles * 5) / 100);
        }
        return change;
    }


    public void setChangeOwed(double changeOwed) {
        this.changeOwed = changeOwed;
    }
}
