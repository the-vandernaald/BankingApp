import java.util.*;

public class AccountCompare implements Comparator<Customer>
{
		@Override
	public int compare(Customer a, Customer b) {
		// TODO Auto-generated method stub
		return a.getLastName().compareTo(b.getLastName());
	}
}
