

public class ItemToPurchase{
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    private String itemDescription;

    public ItemToPurchase(){
        this.itemName = "";
        this.itemPrice = 0;
        this.itemQuantity = 0;
        this.itemDescription = "";
    }

    public ItemToPurchase(String itemName, int itemPrice, int itemQuantity, String itemDescription){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemDescription = itemDescription;
    }

    public void setName(String itemName){
        this.itemName = itemName;
    }
    public String getName(){
        return this.itemName;
    }
    
    public void setPrice(int price){
        this.itemPrice = price;
    }
    public int getPrice(){
        return this.itemPrice;
    }

    public void setQuantity(int quantity){
        this.itemQuantity = quantity;
    }
    public int getQuantity(){
        return this.itemQuantity;
    }

    public void setDescription(String description){
        this.itemDescription = description;
    }
    public String getDescription(){
        return this.itemDescription;
    }

    public void printItemCost(){
        int subtotal = this.itemPrice * this.itemQuantity;
        System.out.println(this.itemName + " " + this.itemQuantity + " @ $" + this.itemPrice + " Subtotal = $" + subtotal);
    }

    public void printItemDescription(){
        System.out.println(this.itemName + ": " + this.itemDescription);
    }
}