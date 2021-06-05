package com.techelevator;

import com.techelevator.view.InventoryInterface;
import com.techelevator.view.Menu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendingMachineCLI implements InventoryInterface, SoundsInterface {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
	private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION};
	private static final String FEED_MONEY_CASH = "Cash";
	private static final String FEED_MONEY_BANK_ACCOUNT = "Bank Account";
	private static final String[] FEED_MONEY_MENU = {FEED_MONEY_CASH, FEED_MONEY_BANK_ACCOUNT};


	private Menu menu;
	private Cash cash;
	private PointOfSale pointOfSale;
	private double cashInput = 0;

	public VendingMachineCLI(Menu menu) throws FileNotFoundException {

		this.menu = menu;
	}
	File dataFile = new File("vendingmachine.csv");
	Scanner dataInput = new Scanner(dataFile);

	public void run() throws FileNotFoundException {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				displayMenuOptions();

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				String choice1 = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				if (choice1.equals(PURCHASE_MENU_FEED_MONEY)) {
					String choice2 = (String) menu.getChoiceFromOptions(FEED_MONEY_MENU);
					if (choice2.equals(FEED_MONEY_CASH)) {
							feedMoneyCash();

					// cash option
					} else if (choice2.equals(FEED_MONEY_BANK_ACCOUNT)) {
						// bank account option
					}

					//get balance
					//feed money method
				} else if (choice1.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
					//select product
					selectProduct();

				} else if (choice1.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
					//finish transaction
				}
			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				// exit
			}
		}
	}
	public void selectProduct() {
		System.out.println("Please select an item to purchase: ");
		menu.getProductChoice();
		String[] options = null;
			while (dataInput.hasNextLine()) {
				String line = dataInput.nextLine();
				options = line.split("\\|");
				if(line.contains(menu.getProductChoice())) {
					double cost = Double.parseDouble(options[2]);
					pointOfSale.setPrice(cost);
					cash.balanceAfterPurchase(cashInput);
					cash.getChangeOwed(cash.getBalanceAfterPurchase());
					System.out.println(cash.getChangeOwed(cash.getBalanceAfterPurchase()));
				}

			}
	}

	public void feedMoneyCash() {
		System.out.println("Please enter cash in whole dollar amounts: ");
		cashInput = (Double) menu.getDoubleFromUserInput();
		System.out.println("Cash entered = " + cashInput);
	}

	public void displayMenuOptions() {
		while(dataInput.hasNextLine()) {
			String line = dataInput.nextLine();
			String[] separated = line.split("\\|");
			String displayString = (separated[1] + " 5");
			System.out.println(displayString);
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
