import java.util.*;
public class MainProgram {
	public static void main(String[] args) {
		MainProgram m = new MainProgram();
		m.welcomeMessage();
	}
	
	public void welcomeMessage() {
		CurrencyExchange ce = new CurrencyExchange();
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Currency Exchange Console!");
		double amount;
		
		boolean exit = false;
		while(!exit) {
			System.out.println("Enter '1' to see exchange rates of USD to other international currency. Enter '2' for other international currency to USD.");
			System.out.println("To exit, enter '0'");
			int userInput = scnr.nextInt();
			switch(userInput) {
			case 0: 
				System.out.println("Exitting out of system, have a nice day!");
				exit = true;
				break;
			case 1:
				System.out.println("Please enter the USD amount you would like to exchange below.");
				amount = scnr.nextDouble();
				ce.exchange1(amount);
				break;
			case 2:
				System.out.println("Please enter the international amount you would like to exchange into USD below.");
				amount = scnr.nextDouble();
				ce.exchange2(amount);
				break;
			default:
				System.out.println("Invalid input detected, please try again.");
				break;
			}
		}
	}
}
