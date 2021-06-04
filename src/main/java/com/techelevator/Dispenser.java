package com.techelevator;

import com.techelevator.view.Menu;
import java.io.FileNotFoundException;

public class Dispenser extends VendingMachineCLI {
    int inventoryAfterPurchase;


    public Dispenser(Menu menu, int inventoryAfterPurchase) throws FileNotFoundException {
        super(menu);
        this.inventoryAfterPurchase = inventoryAfterPurchase;
    }



    //calls the sound, reduces inventory, gives product to user

}
