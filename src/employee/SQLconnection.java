package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLconnection 
{
	public static Connection getConnection() throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/miniproject";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url,username,password);
		return con;
		
	}

}
