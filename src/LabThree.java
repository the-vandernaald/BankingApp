import java.util.*;

public class LabThree
{
	public static void main(String[] args)
	{
		ArrayList<Customer> ex = new ArrayList<Customer>();
		ex.add(new Customer("John", "Smith", "", ""));
		ex.add(new Customer("Jane", "Smyth", "", ""));
		ex.add(new Customer("Micheal", "Carpinter", "", ""));
		ex.add(new Customer("Daniel", "Tailor", "", ""));
		ex.add(new Customer("Jessica", "Hart", "", ""));
		
		System.out.println("unordered:");
		printNames(ex);
		Collections.sort(ex, new AccountCompare());
		System.out.println("\nordered:");
		printNames(ex);
	}
	
	public static void printNames(ArrayList<Customer> c)
	{
		for(Customer x : c)
		{
			System.out.println(x.getFirstName() + " " + x.getLastName());
		}
	}
}