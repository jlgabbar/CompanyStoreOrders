import java.io.Serializable;

public class Purchaser implements Serializable
{

	String name;
	String cardNum;
	
	public Purchaser(){
		name = null;
		cardNum = null;
	}
	
	public Purchaser(String N, String card){
		setName(N);
		setCardNum(card);
	}

	private void setCardNum(String card) {
		cardNum = card;
	}

	private void setName(String n) {
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public String getCardNum(){
		return cardNum;
	}
	
	public String toString(){
		String s = "Purchasers Name: " + name + " card number: " + cardNum;
		return s;
	}
}