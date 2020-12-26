package config;

import java.sql.*;

public class JDBCConnection {
	
	static String url="jdbc:mysql://localhost:3306/pcsdb";
	static String username="root";
	static String password="123456";
	static Connection conn=null;
	
	public static Connection getDBConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");// Loading Driver
			conn=DriverManager.getConnection(url, username, password);	
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println(ex);
		}
		catch(SQLException ex)
		{
			System.out.println("ex");
		}
		return conn;
	}
}
