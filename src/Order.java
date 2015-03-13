import java.io.*;
public class Order implements Serializable
{

	String date;
	Purchaser id;
	Purchases []items;
	double total;
	int count;
	
	public Order(){
		date = null;
	}
	
	public Order(String d){
		setDate(d);
		id = new Purchaser();
		items = new Purchases[10];
		count = 0;
	}
	
	public void setDate(String d){
		date = d;
	}
	
	public void addPerson(String n, String card){
		id = new Purchaser(n, card);
	}
	
	public void addPurchase(String desc, double amt){
		items[count] = new Purchases(desc, amt);
		count++;
	}
	
	public void changePurchase(int index, String desc, double amt){
		items[index] = new Purchases(desc, amt);
	}
	
	public String getDate(){
		return date;
	}
	
	public Purchaser getID(){
		return id;
	}
	
	public void getPurchases(){
		for (int i = 0; i < count; i++){
			System.out.println(items[i]);
		}
	}
	
	public double getTotal(){
		total = 0.0;
		for (int i = 0; i < count; i++){
			total += items[i].getAmount();
		}
		return total;
	}
	
	public int getCount(){
		int itemcount = count;
		return itemcount--;
	}
}