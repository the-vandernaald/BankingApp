import java.util.Scanner;

public class Employee extends User
{
	Employee(String fName, String lName, String pName, String uName)
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
		System.out.println("What would you like to do? (enter the apropreate number)\n1. Change user's personal information\n2.");
		try
		{
			x = Integer.parseInt(reader.nextLine().substring(0,1));
			switch(x)
			{
			case 1 :
				System.out.println("Please specify the account whose personal information you would like to change:");
				String s = reader.nextLine();
				// Get user account from database
				
				Customer c = null; // holder to remove error
				
				this.changeUserPersonalInfo(c);
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
	
	private void changeUserPersonalInfo(User c)
	{
		Scanner reader = new Scanner(System.in);
		int x;
		System.out.println("What personal information assosciated with this account would you like to change? "
						   + "(enter the apropreate number)\n1. User Name\n2. Prefered Name\n3. First Name\n4. Last Name");
		try
		{
			x = Integer.parseInt(reader.nextLine().substring(0,1));
			boolean q = true;
			switch(x)
			{
				case 1 :
					while(q)
					{
						System.out.println("The current prefered name associated to this account is: " + c.getPreferedName() + "\nEnter the new prefered name:");
						String s = reader.nextLine();
						System.out.println("The new prefered name associated with this account will be: " + s + "\nIs this correct? (y/n");
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
						System.out.println("The current user name associated with this account is: " + this.getUserName() + "\nEnter the new user name:");
						String s = reader.nextLine();
						System.out.println("The new user name associated with this account will be: " + s + "\nIs this correct? (y/n");
						String r = reader.nextLine();
						if(r.length() > 0 && r.substring(0,1).toLowerCase().equals("y"))
						{
							q = false;
							this.changeUserName(s);
						}
					}
					break;
				case 3 :
					while(q)
					{
						System.out.println("The current first name associated with this account is: " + this.getFirstName() + "\nEnter the new first name:");
						String s = reader.nextLine();
						System.out.println("The new first name associated with this account will be: " + s + "\nIs this correct? (y/n");
						String r = reader.nextLine();
						if(r.length() > 0 && r.substring(0,1).toLowerCase().equals("y"))
						{
							q = false;
							this.changeUserName(s);
						}
					}
					break;
				case 4 :
					while(q)
					{
						System.out.println("The current last name associated with this account is: " + this.getLastName() + "\nEnter the new last name:");
						String s = reader.nextLine();
						System.out.println("The new last name associated with this account will be: " + s + "\nIs this correct? (y/n");
						String r = reader.nextLine();
						if(r.length() > 0 && r.substring(0,1).toLowerCase().equals("y"))
						{
							q = false;
							this.changeUserName(s);
						}
					}
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
	
	private void closeCustomerAccount(Customer c)
	{
		
	}
	
	private void createCustomerAccount()
	{
		
	}
	
	private void viewCustomerAccountInfo(Customer c)
	{
		System.out.println("Account Number: " + c.getAccountNumber() + "First Name: " + c.getFirstName() + "\nPrefered Name: " + c.getPreferedName() + "\nLast Name: " 
						   + c.getLastName() + "User Name: " + c.getUserName());
		for(Account a : c.getAccounts())
		{
			// Print account info
		}
	}
}
