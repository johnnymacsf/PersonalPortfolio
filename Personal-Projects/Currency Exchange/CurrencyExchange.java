import java.util.*;
public class CurrencyExchange {
	protected double exchange = 0;
	protected String currency = "";
	
	public void welcome() {
		System.out.println("Below are the following codes for international currency. Enter below to exchange.");
		System.out.println("EUR = Euro, GBP = British Pound, AUD = Australian dollar, CAD = Canadian dollar, JPY = Japanese Yen, CNY = Chinese Yuan, SGD = Singapore dollar, INR = Indian Rupee, CHF = Swiss Franc");
	}
	
	public void exchange1(double amount) {
		double exchanged = 0;
		Scanner scnr = new Scanner(System.in);
		CurrencyExchange ce = new CurrencyExchange();
		ce.welcome();
		String exchange = scnr.next();
		boolean bool = true;
		String result = "";
		while(bool) {
			switch(exchange) {
				case "EUR":
					exchanged = amount * 0.916543;
					currency = "Euros";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "GBP":
					exchanged = amount * 0.786572;
					currency = "British Pounds";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "INR":
					exchanged = amount * 82.008330;
					currency = "Indian Rupees";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "AUD":
					exchanged = amount * 1.498048;
					currency = "Australian Dollars";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "CAD":
					exchanged = amount * 1.315492;
					currency = "Canadian Dollars";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "SGD":
					exchanged = amount * 1.353533;
					currency = "Singapore Dollars";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "CHF":
					exchanged = amount * 0.895624;
					currency = "Swiss Francs";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "JPY":
					exchanged = amount * 143.441449;
					currency = "Japanese Yen";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "CNY":
					exchanged = amount * 7.237294;
					currency = "Chinese Yuan";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				default:
					System.out.println("Invalid input, please enter a valid international currency.");
					bool = false;
					break;
			}
		}
	}
	public void exchange2(double amount) {
		double exchanged = 0;
		Scanner scnr = new Scanner(System.in);
		CurrencyExchange ce = new CurrencyExchange();
		ce.welcome2();
		String exchange = scnr.next();
		boolean bool = true;
		String result = "";
		while(bool) {
			switch(exchange) {
				case "EUR":
					exchanged = amount * 1.091057;
					currency = "Euros";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "GBP":
					exchanged = amount * 1.271339;
					currency = "British Pounds";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "INR":
					exchanged = amount * 0.012194;
					currency = "Indian Rupees";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "AUD":
					exchanged = amount * 0.667535;
					currency = "Australian Dollars";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "CAD":
					exchanged = amount * 0.760172;
					currency = "Canadian Dollars";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "SGD":
					exchanged = amount * 1.116540;
					currency = "Singapore Dollars";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "CHF":
					exchanged = amount * 0.213967;
					currency = "Swiss Francs";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "JPY":
					exchanged = amount * 0.006971;
					currency = "Japanese Yen";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
				case "CNY":
					exchanged = amount * 0.138173;
					currency = "Chinese Yuan";
					result = String.format("%.2f", exchanged);
					System.out.println("Your " + amount + " " + currency + " is $" + result + ".");
					bool = false;
					break;
			}
		}
	}
	public void welcome2() {
		System.out.println("Enter the international currency code for the amount of money you just entered to exchange it into USD.");
		System.out.println("EUR = Euro, GBP = British Pound, AUD = Australian dollar, CAD = Canadian dollar, JPY = Japanese Yen, CNY = Chinese Yuan, SGD = Singapore dollar, INR = Indian Rupee, CHF = Swiss Franc");
	}
}
