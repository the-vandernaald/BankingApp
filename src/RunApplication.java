import java.sql.*;


public class RunApplication
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root", "password");  
			
			addCustomer(con, new Customer("a", "a", "a", "a"), "password");
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
		
		
	}
	
	public static void addCustomer(Connection c1, Customer c2, String password)
	{
		try
		{
			
			String q1 = "select max(1) from customers;";
			ResultSet maxaccnum = c1.prepareStatement(q1).executeQuery();
			maxaccnum.beforeFirst();
			maxaccnum.next();
			int max = maxaccnum.getInt(1);
			String q = "insert into customers (accountnumber, firstname, lastname, prefferedname, username, pword) values (?, ?, ?, ?, ?, ?)";
			PreparedStatement p = c1.prepareStatement(q);
			p.setInt(1, max + 1);
			p.setString(2, c2.getFirstName());
			p.setString(3, c2.getLastName());
			p.setString(4, c2.getPreferedName());
			p.setString(5, c2.getUserName());
			p.setString(6, password);
			p.execute();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
