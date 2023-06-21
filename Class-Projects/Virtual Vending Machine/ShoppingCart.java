import java.io.PrintWriter;
import java.util.*;
public class ShoppingCart {
	protected ArrayList<String> list = new ArrayList<>();
	VendingMachine vm = new VendingMachine();
	HashMap<String, Double> v = vm.getVendingMachine();
	HashMap<Integer, String> c = vm.getCodes();
	protected double sumTotal = 0;
	public void add(String code) {
		int itemCode = Integer.valueOf(code);
		String itemName = c.get(itemCode);
		list.add(itemName);
		System.out.println("Your shopping cart now includes: " + list + ".");
		double price = v.get(itemName);
		sumTotal += price;
		
	}
	
	public void remove(String code) {
		int itemCode = Integer.valueOf(code);
		String itemName = c.get(itemCode);
		list.remove(itemName);
		System.out.println("You have removed " + itemName + " from your shopping cart.");
		System.out.println("Your shopping cart now includes: " + list + ".");
		double price = v.get(itemName);
		sumTotal -= price;
	}
	
	public void viewTotal() {
		System.out.println("Your total is: $" + sumTotal);
	}
	
	public void pay() {
		ShoppingCart sm = new ShoppingCart();
		System.out.println("Your total is: $" + sumTotal);
		while(sumTotal > 0) {
			System.out.println("Please insert your cash below:");
			Scanner scnr = new Scanner(System.in);
			double cash = scnr.nextDouble();
			sumTotal -= cash;
			if(sumTotal == 0) {
				System.out.println("Thank you, and have a great day!");
				break;
			}
			else if(sumTotal < 0) {
				double change = sumTotal * -1.0;
				System.out.println("Your change is : $" + change);
				System.out.println("Thank you, and have a great day!");
				break;
			}
			else if(sumTotal > 0) {
				System.out.println("You still owe $" + sumTotal + ".");
				
			} 
		}
	}
}
