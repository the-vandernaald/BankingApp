
public class Account
{
	private int accNumber;
	private int accOwner;
	private int accType; // 1 for savings, 2 for checking
	private long accBalance; // measured in cents
	
	Account(int aType, long balance, ing owner)
	{
		this.accType = aType;
		this.accBalance = balance;
		this.accOwner = owner;
	}
	
	public int getAccoutType()
	{
		return accType;
	}
	
	public String getAccountTypeS()
	{
		switch(accType)
		{
			case 1 :
				return "Savings";
			case 2 : 
				return "Checking";
			default : 
				return "Error, unknown account type";
		}
	}
	
	public long getAccountBalance()
	{
		return accBalance;
	}
	
	public void deposit(long amount, int accountNumber) // transfer money from other account to this account
	{
		accBalance += amount;
		// Log increase and account it came from in database
		// verify the transfer
	}
	
	public void withdraw(long amount, int accountNumber) //transfer money from this account to another account
	{
		accBlance -= amount;
		// Get account other account from database
		// deposit funds in other account
		// Log increase and account it came from in database
		// verify the transfer
	}
}
