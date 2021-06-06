package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
    String productCode = "";
    String productName = "";
    double price = 0.0;
    String productSection = "";
    Scanner scanFile = new Scanner("vendingmachine.csv");
    int numberLeft = 0;


    public Inventory(String productCode, String productName, double price, String productSection) throws FileNotFoundException {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.productSection = productSection;
    }

    // take info from data file and put each line into an array and then array indexes into maps


    File dataFile = new File("vendingmachine.csv");
    Scanner dataInput = new Scanner(dataFile);

    public void populateArrays() {
        while (dataInput.hasNextLine()) {
            String[] fileInfo = null;
            String line = dataInput.nextLine();
            fileInfo = line.split("\\|");
             productCode = fileInfo[0];
             productName = fileInfo[1];
             price = Double.parseDouble(fileInfo[2]);
             productSection = fileInfo[3];

            System.out.println(productCode);


        }



    // get name if item and remaining inventory of item for display menu

      //  Map<String, Integer> nameAndInventory = new HashMap<>();
     //   nameAndInventory.put(productName, numberLeft);


    // get slots and products display for purchase menu

      //  Map<String, String> slotsAndProducts = new HashMap<>();
      //  slotsAndProducts.put(productCode, productName);

    // get category and price for end transaction menu

      //  Map<String, Double> categoryAndPrice = new HashMap<>();
       // categoryAndPrice.put(productSection, price);
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
