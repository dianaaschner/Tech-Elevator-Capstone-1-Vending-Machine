package com.techelevator;

public class Chips extends Inventory {
    private String sound = "Crunch Crunch, Yum!";

    public Chips(String productCode, String productName, double price, String productSection) {
        super(productCode, productName, price, productSection);
    }





    public String getSound() {
        return sound;
    }
}
