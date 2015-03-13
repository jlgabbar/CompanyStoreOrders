import java.io.Serializable;

public class Purchases implements Serializable
{

	String description;
	Double amount;
	
	public Purchases(){
		description = null;
		amount = 0.0;
	}
	
	public Purchases (String desc, double amt){
		setDescription(desc);
		setAmount(amt);
	}

	public void setAmount(double amt) {
		amount = amt;
	}

	public void setDescription(String desc) {
		description = desc;
	}
	
	public String getDescription(){
		return description;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public String toString(){
		String s = "Purchase description: " + description + "  amount: $" + amount;
		return s;
	}
}