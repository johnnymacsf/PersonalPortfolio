import java.util.*;
import java.io.PrintWriter;
public class MainProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		VendingMachine vendingMachine = new VendingMachine();
		PrintWriter printer = new PrintWriter(System.out);
		ShoppingCart shoppingCart = new ShoppingCart();
		String input;
		boolean quit = false;
		HashMap<String, Double> hmap = vendingMachine.getVendingMachine();
		HashMap<Integer, String> hmap2 = vendingMachine.getCodes();
		
		System.out.println("Here is what we have in the vending machine: ");
		vendingMachine.print(printer);
		System.out.println("To add an item to your shopping cart, please enter 'add' followed by the item code. To start the check-out process, enter 'pay'.");
		//System.out.println("To start the check-out process, enter 'pay'.");
		//System.out.println("To cancel your transaction, enter 'quit'.");
		System.out.println("For additional information, please enter 'help'.");
		while(!quit) {
			input = scnr.nextLine();
			if(input.equals("print")) {
				vendingMachine.print(printer);
			}else if(0 == input.indexOf("add ")) {
				System.out.println("Adding to shopping cart...");
				shoppingCart.add(input.substring(4));	
			}else if(0 == input.indexOf("remove ")) {
				System.out.println("Removing from shopping cart...");
				shoppingCart.remove(input.substring(7));
			}else if(input.equals("help")) {
				printHelp();
			}else if(input.equals("view")) {
				shoppingCart.viewTotal();
			}else if(input.equals("pay")) {
				shoppingCart.pay();
				break;
			}
			else if(input.equals("quit")) {
				quit = true;
				System.out.println("Exiting out of transaction. Have a great day!");
			}
		}
	}
	public static void printHelp() {
		System.out.println("To add an item to your shopping cart, please enter 'add' followed by the item code");
		System.out.println("If you wish to remove an item from your cart, enter 'remove' followed by the item code and it will be removed from your shopping cart.");
		System.out.println("If you wish to look at your total, enter 'view'");
		System.out.println("To see vending machine options again, enter 'print'");
		System.out.println("To start the check-out process, enter 'pay'");
		System.out.println("To cancel your transaction, enter 'quit'.");
	}
}
