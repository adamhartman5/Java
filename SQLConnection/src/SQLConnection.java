import java.sql.*;
import java.util.Properties;

public class SQLConnection {
	public static void main(String[] args) throws Exception
	{

		getConnection();

	}
		
	public static Connection getConnection() throws Exception
	{
		try
		{
			String driver ="com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/java";
			String username = "javauser";
			String password = "java1234";
			Class.forName(driver);
				
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Successfully connected to the java database");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
			
		return null;
	}
}
