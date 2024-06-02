import java.util.Scanner;

public class ShoppingCartPrinter{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        
        String name ="";
        int price = 0;
        int quantity = 0;

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        name = scnr.nextLine();
        System.out.println("Enter the item price:");
        price = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        quantity = scnr.nextInt();
        item1.setName(name);
        item1.setPrice(price);
        item1.setQuantity(quantity);

        System.out.println("");
        scnr.nextLine();

        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        name = scnr.nextLine();
        System.out.println("Enter the item price:");
        price = scnr.nextInt();
        System.out.println("Enter the item quantity:");
        quantity = scnr.nextInt();
        item2.setName(name);
        item2.setPrice(price);
        item2.setQuantity(quantity);

        System.out.println("");
        System.out.println("TOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + (item1.getPrice() * item1.getQuantity()));
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + (item2.getPrice() * item2.getQuantity()));
        System.out.println("");
        int total = item1.getPrice() * item1.getQuantity() + item2.getPrice() * item2.getQuantity();
        System.out.println("Total: $" + total);
    }
}