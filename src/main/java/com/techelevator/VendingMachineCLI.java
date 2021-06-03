package com.techelevator;

import com.techelevator.view.Menu;

public class VendingMachineCLI {

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

	public VendingMachineCLI(Menu menu) {

		this.menu = menu;
	}

	public void run() {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				String choice1 = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				if (choice1.equals(PURCHASE_MENU_FEED_MONEY)){
					String choice2 = (String) menu.getChoiceFromOptions(FEED_MONEY_MENU);
					if (choice2.equals(FEED_MONEY_CASH)){
					// cash option
					} else if (choice2.equals(FEED_MONEY_BANK_ACCOUNT)){
						// bank account option
					}

					//get balance
					//feed money method
				} else if (choice1.equals(PURCHASE_MENU_SELECT_PRODUCT)){
					//select product
				} else if (choice1.equals(PURCHASE_MENU_FINISH_TRANSACTION)){
					//finish transaction
				}
			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)){
				// exit
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
