import java.sql.*;

public class SQLCreateTable {
	
	public static void main(String[] args) throws Exception
	{
		createTable();
	}
	
	public static void createTable() throws Exception
	{
		try 
		{
			Connection con = getConnection();
			PreparedStatement empTableCreate = con.prepareStatement("CREATE TABLE Employee(Emp_ID Int(4) NOT NULL AUTO_INCREMENT, Emp_FName VARCHAR (25), Emp_Lname VARCHAR (25), Gender VARCHAR (10), PRIMARY KEY (Emp_ID))");
			PreparedStatement addressTableCreate = con.prepareStatement("CREATE TABLE Address(Add_ID Int(4) NOT NULL AUTO_INCREMENT, Emp_ID Int(4), Street_Address VARCHAR (50), State VARCHAR(2), Zip Int(5), PRIMARY KEY (Add_ID), FOREIGN KEY (Emp_ID) REFERENCES Employee(Emp_ID))");
			empTableCreate.executeUpdate();
			addressTableCreate.executeUpdate();
			System.out.println("Successfully created tables in java database");
		}
		
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static Connection getConnection() throws Exception
	{
		try
		{
			String driver ="com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/java?autoReconnect=true&useSSL=false";
			String username = "javauser";
			String password = "java1234";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully connected to the java database");

			return conn;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}
}
