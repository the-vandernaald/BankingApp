import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User
{
	private ArrayList<Integer> accounts = new ArrayList<>();
	
	Customer(String fName, String lName, String pName, String uName)
	{
		this.changeFirstName(fName);
		this.changeLastName(lName);
		this.changePreferedName(pName);
		this.changeUserName(uName);
		
		// create database entry
		// set account number with the primary key of database entry
		// set password in database
	}
	
	public void userOptions()
	{
		Scanner reader = new Scanner(System.in);
		int x;
		System.out.println("What would you like to do? (enter the apropreate number)\n1. Change personal information\n2.");
		try
		{
			x = Integer.parseInt(reader.nextLine().substring(0,1));
			switch(x)
			{
			case 1 :
				this.changePersonalInfo();
				break;
			default :
				System.out.println("An error has occured, please enter a valid number.");
			}
		}
		catch (Exception e)
		{
			System.out.println("An error has occured, please enter a valid number.");
		}
		reader.close();
	}
	
	public ArrayList<Integer> getAccounts()
	{
		return accounts;
	}
	
	private void changePersonalInfo()
	{
		Scanner reader = new Scanner(System.in);
		int x;
		System.out.println("What personal information assosciated with this account would you like to change? "
						   + "(enter the apropreate number)\n1. User Name\n2. Prefered Name\n3. First or Last Name");
		try
		{
			x = Integer.parseInt(reader.nextLine().substring(0,1));
			boolean q = true;
			switch(x)
			{
				// check if new names are valid
				case 1 :
					while(q)
					{
						System.out.println("Your current prefered name is: " + this.getPreferedName() + "\nEnter your new prefered name:");
						String s = reader.nextLine();
						System.out.println("Your new prefered name will be: " + s + "\nIs this correct? (y/n");
						String r = reader.nextLine();
						if(r.length() > 0 && r.substring(0,1).toLowerCase().equals("y"))
						{
							q = false;
							this.changePreferedName(s);
						}
					}
					break;
				case 2 :
					while(q)
					{
						System.out.println("Your current user name is: " + this.getUserName() + "\nEnter your new user name:");
						String s = reader.nextLine();
						System.out.println("Your new user name will be: " + s + "\nIs this correct? (y/n");
						String r = reader.nextLine();
						if(r.length() > 0 && r.substring(0,1).toLowerCase().equals("y"))
						{
							q = false;
							this.changeUserName(s);
						}
					}
					break;
				case 3 :
					System.out.print("Please contact a bank official to change the first or last name associated with this account.  "
									 + "Please bring in official paperword designating your change of name.");
					break;
				default :
					System.out.println("An error has occured, please enter a valid number.");
			}
		}
		catch(Exception e)
		{
			System.out.println("An error has occured, please enter a valid number.");
		}
		reader.close();
	}
	
	public void getAccountInfo()
	{
		
	}
	
	/**
	private long getAccountsBalance(int i)
	{
		int acc = this.accounts.get(i);
		// Get account from database
		// get balance from account and return
	} */
}
