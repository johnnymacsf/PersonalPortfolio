import java.util.*;
import java.io.PrintWriter;
public class VendingMachine {
	private HashMap<String, Double> items = new HashMap<String, Double>();
	private HashMap<Integer, String> codes = new HashMap<Integer, String>();
	
	public HashMap<String, Double> getVendingMachine(){
		items.put("Chips", 1.50);
		items.put("Chocolate bar", 1.75);
		items.put("Candy bag", 1.75);
		items.put("Small soda can", 0.75);
		items.put("Large soda bottle", 2.00);
		items.put("Energy drink", 1.75);
		return items;
	}
	public HashMap<Integer, String> getCodes(){
		codes.put(1, "Chips");
		codes.put(2, "Chocolate bar");
		codes.put(3, "Candy bag");
		codes.put(4, "Small soda can");
		codes.put(5, "Large soda bottle");
		codes.put(6, "Energy drink");
		return codes;
	}
	
	public void print(PrintWriter x) {
		Iterator<Map.Entry<String,Double>> iterator = items.entrySet().iterator();
		int code = 1;
		
		for(Map.Entry<String, Double> mapEl : items.entrySet()) {
			String key = mapEl.getKey();
			double val = (mapEl.getValue());
			System.out.println("Item: " + key + ", code: " + code + ", price: $" + val);
			code++;
		}
		}
	}
