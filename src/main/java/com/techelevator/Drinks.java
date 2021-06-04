package com.techelevator;

public class Drinks extends Inventory {
    private String sound = "Glug Glug, Yum!";

    public Drinks(String productCode, String productName, double price, String productSection) {
        super(productCode, productName, price, productSection);
    }
    public String getSound() {
        return sound;
    }
}
