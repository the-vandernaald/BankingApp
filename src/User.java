
public class User
{
	private String userName;
	private int accountNumber;
	private String firstName;
	private String lastName;
	// Date of Birth
	private String preferedName; //null if user has no preferred name
	
	public void userOptions() {}
	
	protected final String getFirstName()
	{
		return this.firstName;
	}
	
	protected final String getLastName()
	{
		return this.lastName;
	}
	
	protected final String getPreferedName()
	{
		return this.preferedName;
	}
	
	protected final String getUserName()
	{
		return this.userName;
	}
	
	protected final int getAccountNumber()
	{
		return this.accountNumber;
	}

	protected void changePreferedName(String s)
	{
		//log name change and previous name
		this.preferedName = s;
	}
	
	protected void changeUserName(String s)
	{
		//log name change and previous name
		this.userName = s;
	}
	
	protected void changeFirstName(String s)
	{
		//log name change and previous name
		this.firstName = s;
	}
	
	protected void changeLastName(String s)
	{
		//log name change and previous name
		this.lastName = s;
	}
}
