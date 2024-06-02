import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingCartManager{
    public static void printMenu(){
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
        System.out.println("");
    }

    public static void executeMenu(char userChoice, ShoppingCart cart, Scanner scnr){
        switch(userChoice){
            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                System.out.println(cart.getCustomerName() + "'s Shopping Cart - " + cart.getCurrentDate());
                System.out.println("Number of items: " + cart.getNumItemsInCart());
                cart.printTotal();
                System.out.println("");
                break;
            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                System.out.println(cart.getCustomerName() + "'s Shopping Cart - " + cart.getCurrentDate());
                System.out.println("");
                cart.printDescriptions();
                break;
            case 'a':
                System.out.println("ADD ITEM TO CART");
                scnr.nextLine();
                System.out.println("Enter the item name:");
                String itemName = scnr.nextLine();
                System.out.println("Enter the item description:");
                String itemDescription = scnr.nextLine();
                System.out.println("Enter the item price:");
                int itemPrice = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                int itemQuantity = scnr.nextInt();
                ItemToPurchase item = new ItemToPurchase(itemName, itemPrice, itemQuantity, itemDescription);
                cart.addItem(item);
                break;
            case 'd':
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of an item to remove:");
                String removeName = scnr.nextLine();
                cart.removeItem(removeName);
                break;
            case 'c':
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                String changeQuantityName = scnr.nextLine();
                System.out.println("Enter the new quantity:");
                int newQuantity = scnr.nextInt();
                cart.modifyItem(changeQuantityName, newQuantity);
                break;
        }
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the customer's name:");
        String customerName = scnr.nextLine();
        System.out.println("Enter the current date:");
        String currentDate = scnr.nextLine();
        System.out.println("");
        ShoppingCart cart = new ShoppingCart(customerName, currentDate);
        System.out.println("Customer name: " + cart.getCustomerName());
        System.out.println("Current date: " + cart.getCurrentDate());

        printMenu();
        System.out.println("Choose an option: ");
        char userOption = scnr.next().charAt(0);
        while(userOption != 'q'){
            printMenu();
            System.out.println("Choose an option: ");
            if(userOption != 'a' && userOption != 'd' && userOption != 'c' && userOption != 'i' && userOption != 'o'){
                System.out.println("Please enter a valid option:");
                userOption = scnr.next().charAt(0);

            }else{
                executeMenu(userOption, cart, scnr);
                printMenu();
                System.out.println("Choose an option: ");
                userOption = scnr.next().charAt(0);
            }
        }
    }
}