package com.techelevator;

import com.techelevator.view.Menu;
import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cash extends PointOfSale {
    private double changeOwed;
    private double balanceAfterPurchase;

   // private PrintWriter out;
 //   String cashInserted = null;
   // Scanner cashInput = new Scanner(System.in.toString());

    public Cash() {
    }

    public Cash(double balanceAfterUserInput) {
        super(balanceAfterUserInput);
//        this.balanceAfterPurchase = balanceAfterPurchase;
    }



    public double getBalanceAfterPurchase(double balanceAfterUserInput) {
        balanceAfterPurchase = balanceAfterUserInput - getPrice();
        return balanceAfterPurchase;
    }

    public int[] getChangeOwed(double balanceAfterPurchase) {

        int countDimes = 0;
        int countNickles = 0;
        int countQuarters = 0;
        int[] change = new int[] { countQuarters, countDimes, countNickles, };
        while(this.balanceAfterPurchase >= 0.25) {
            countQuarters++;
             this.balanceAfterPurchase -= ((countQuarters * 25) / 100);
        } while(this.balanceAfterPurchase >= 0.10 && this.balanceAfterPurchase < 0.25) {
            countDimes++;
            this.balanceAfterPurchase -= ((countDimes * 10) / 100);
        } while(this.balanceAfterPurchase >= 0.05 && this.balanceAfterPurchase < 0.10) {
            countNickles++;
            this.balanceAfterPurchase -= ((countNickles * 5) / 100);
        }
        System.out.println("Quarters returned: " + countQuarters);
        System.out.println("Dimes returned: " + countDimes);
        System.out.println("Nickles returned: " + countNickles);

        return change;
    }

//    public double getBalanceAfterPurchase() {
//        return balanceAfterPurchase;
//    }

    public void setChangeOwed(double changeOwed) {
        this.changeOwed = changeOwed;
    }
}
