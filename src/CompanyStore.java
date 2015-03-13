import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.*;

public class CompanyStore
{
	String storeName;
	ArrayList<Order> lists;
	
	public CompanyStore(String s)
	
	{
		storeName = s;
		lists= new ArrayList<Order>(20);
		
	}
	public void addOrder(Order o)
	{
			
		lists.add(o);
	}
	public void saveOrders(String filename)throws IOException
	{
		 FileOutputStream orderfile = new FileOutputStream(filename);
         ObjectOutputStream objectFile = new ObjectOutputStream(orderfile);
         for (Order i : lists)
             {
             objectFile.writeObject(i);
             }
         objectFile.close();
	}
	public void readOrders(String filename) throws IOException
	{
		FileInputStream orderfile = new FileInputStream(filename);
        ObjectInputStream objectFile= new ObjectInputStream(orderfile);
        try
        {
            while(true)
            {
                lists.add((Order)objectFile.readObject());
                
            }
        }
     catch(ClassNotFoundException e)
     {
         System.out.println("attempt to read an object of a type not defined");
     }
     catch(EOFException e)
     {
         objectFile.close();
         
     }
	}
	public void displayOrders()
	{
			System.out.println("Company Name: " + storeName);
			System.out.println(lists.get(0).getDate());
			System.out.println(lists.get(0).getID());
			lists.get(0).getPurchases();
			System.out.println("Order Total: "+lists.get(0).getTotal());
			System.out.println(lists.get(1).getDate());
			System.out.println(lists.get(1).getID());
			lists.get(1).getPurchases();
			System.out.println("Order Total: "+lists.get(1).getTotal());
			System.out.println(lists.get(2).getDate());
			System.out.println(lists.get(2).getID());
			lists.get(2).getPurchases();
			System.out.println("Order Total: "+lists.get(2).getTotal());

	}
}
