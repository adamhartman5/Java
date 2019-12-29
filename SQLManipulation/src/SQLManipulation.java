import java.sql.*;
import java.util.ArrayList;

public class SQLManipulation {
	public static void main(String[] args) throws Exception
	{
		CreateTable();
		InsertRecords();
		DisplayStudentInfo();

	}
	
	public static void CreateTable () throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement studentTableCreate = con.prepareStatement("CREATE TABLE student (studentID int(4) not null auto_increment, name varchar(50) not null, email varchar(50), major varchar(25), PRIMARY KEY (studentID));");
			studentTableCreate.executeUpdate();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

	public static void InsertRecords() throws Exception
	{
		try {
			Connection con = getConnection();
			Statement insert = con.createStatement();
			insert.executeUpdate("INSERT INTO student VALUES (0001, 'John Smith', 'smithj@daytonastate.edu', 'Computer Science');");
			insert.executeUpdate("INSERT INTO student VALUES (0002, 'Rafael Jones', 'jonesr@daytonastate.edu', 'Nursing');");
			insert.executeUpdate("INSERT INTO student VALUES (0003, 'Jane Carter', 'carterj@daytonastate.edu', 'Elementary Ed');");
			insert.executeUpdate("INSERT INTO student VALUES (0004, 'Barbara Torres', 'torresb@daytonastate.edu', 'Photography');");
			insert.executeUpdate("INSERT INTO student VALUES (0005, 'Jason Coleman', 'colemanj@daytonastate.edu', 'Biology');");
			insert.executeUpdate("INSERT INTO student VALUES (0006, 'Allison Hoffman', 'hoffmana@daytonastate.edu', 'Business Administration');");

			System.out.println("Records inserted successfully");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}


	}

	public static ArrayList<String> DisplayStudentInfo() throws Exception
	{
		try
		{
			Connection con = getConnection();
			PreparedStatement query = con.prepareStatement("SELECT * FROM student");

			ResultSet result = query.executeQuery();

			ArrayList<String> array = new ArrayList<String>();

			while (result.next())
			{
				System.out.println("Student ID: " + result.getInt("studentID"));
				System.out.println("Name: " + result.getString("name"));
				System.out.println("Email Address: " + result.getString("email"));
				System.out.println("Major: " + result.getString("major"));
				System.out.println();
			}

			System.out.println("All results have been displayed");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		return null;

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
			System.out.println();

			return conn;
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		return null;
	}

}
