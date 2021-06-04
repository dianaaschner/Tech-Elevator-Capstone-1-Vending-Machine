package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Inventory {
    String productCode = "";
    String productName = "";
    double price = 0.0;
    String productSection = "";
    Scanner scanFile = new Scanner("vendingmachine.csv");


    public Inventory(String productCode, String productName, double price, String productSection) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.productSection = productSection;
    }






    //getters and setters
    public File getInventoryFile() throws FileNotFoundException {
        try(FileReader readFile = new FileReader("vendingmachine.csv"))
        {
        } catch (IOException e) {
            e.printStackTrace();
        }
        String path = scanFile.nextLine();
        File inventoryFile = new File(path);
        String line = scanFile.nextLine();
        while(scanFile.hasNextLine()) {
            System.out.println(line);
        }
        return inventoryFile;
    }



        public String getProductSection() {
            return productSection;
        }
        public void setProductSection(String productSection) {
            this.productSection = productSection;
        }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
