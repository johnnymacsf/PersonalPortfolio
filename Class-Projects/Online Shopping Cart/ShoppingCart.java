import java.util.ArrayList;

public class ShoppingCart{
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart(){
        this.customerName = "";
        this.currentDate = "";
        this.cartItems = new ArrayList<ItemToPurchase>();
    }
    public ShoppingCart(String customerName, String currentDate){
        this.customerName = customerName;
        this.currentDate = currentDate;
        this.cartItems = new ArrayList<ItemToPurchase>();
    }

    public String getCustomerName(){
        return this.customerName;
    }
    
    public String getCurrentDate(){
        return this.currentDate;
    }

    public void addItem(ItemToPurchase item){
        this.cartItems.add(item);
    }
    public void removeItem(String name){
        boolean found = false;
        for(int i = 0; i < cartItems.size(); i++){
            String cartItemName = this.cartItems.get(i).getName();
            if(cartItemName.equals(name)){
                found = true;
                cartItems.remove(i);
                break;
            }
        }
        if(!found){
            System.out.println("Item not found in cart. Nothing removed.");
        }
    }
    public void modifyItem(String name, int quantity){
        boolean found = false;
        for(int i = 0; i < cartItems.size(); i++){
            String cartItemName = this.cartItems.get(i).getName();
            if(cartItemName.equals(name)){
                cartItems.get(i).setQuantity(quantity);
                found = true;
            }
        }
        if(!found){
            System.out.println("Item not found in cart. Nothing modified.");
        }
    }
    public int getNumItemsInCart(){
        return this.cartItems.size();
    }
    public int getCostOfCart(){
        int total = 0; 
        for(int i = 0; i < cartItems.size(); i++){
            total += (cartItems.get(i).getPrice() * cartItems.get(i).getQuantity());        
        }
        return total;
    }
    public void printTotal(){
        if(cartItems.isEmpty()){
            System.out.println("Cart is empty.");
        }else{
            for(int i = 0; i < this.getNumItemsInCart(); i++){
                int subtotal = this.cartItems.get(i).getPrice() * this.cartItems.get(i).getQuantity();
                System.out.println(this.cartItems.get(i).getName() + " " + this.cartItems.get(i).getQuantity() + " @ $" + this.cartItems.get(i).getPrice() + " = $" + subtotal);
            }
            System.out.println("");
            System.out.println("Total: $" + getCostOfCart());
        }
    }
    public void printDescriptions(){
        if(cartItems.isEmpty()){
            System.out.println("Cart is empty.");
        }else{
            for(int i = 0; i < cartItems.size(); i++){
                ItemToPurchase item = cartItems.get(i);
                System.out.println(item.getName() + ": " + item.getDescription());
            }
        }
    }
}