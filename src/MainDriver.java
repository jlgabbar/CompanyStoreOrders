import java.io.*;
public class MainDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		CompanyStore c = new CompanyStore("NextIT");
		Order[] o = new Order[3];
		o[0]=new Order("April 25th");
		o[0].addPerson("Joseph Gabbard","73637282");
		o[0].addPurchase("Food", 36.00);
		o[0].addPurchase("clothing", 59.00);
		o[0].addPurchase("Bills", 300.00);
		o[1]= new Order("February 1st");
		o[1].addPerson("Billy", "393838383");
		o[1].addPurchase("Books", 459.00);
		o[1].addPurchase("Tuition",4568.00);
		o[2] = new Order("October 5th");
		o[2].addPerson("John Mills", "0924373");
		o[2].addPurchase("Wal Mart", 93.00);
		o[2].addPurchase("Supplies", 45.00);
		c.addOrder(o[0]);
		c.addOrder(o[1]);
		c.addOrder(o[2]);
		c.displayOrders();
		c.saveOrders("joey.dat");
		c.readOrders("joey.dat");
		c.displayOrders();
	}

}
