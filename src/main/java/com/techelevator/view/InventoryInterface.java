package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public interface InventoryInterface {
Scanner scanFile = new Scanner("vendingmachine.csv");


    default File getInventoryFile() throws FileNotFoundException {
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






}
