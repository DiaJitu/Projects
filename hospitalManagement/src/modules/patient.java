package modules;
import java.sql.*;
public class patient 
{

	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3360/hospital","root","help");
		System.out.println("Connection created")
		// TODO Auto-generated method stub

	}

}
