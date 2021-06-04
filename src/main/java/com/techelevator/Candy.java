package com.techelevator;

public class Candy extends Inventory {
    private String sound = "Munch Munch, Yum!";


    public Candy(String productCode, String productName, double price, String productSection) {
        super(productCode, productName, price, productSection);
    }
    public String getSound() {
        return sound;
    }
}
