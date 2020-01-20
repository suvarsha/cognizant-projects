package sqlb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	//step1 load driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//create object connection
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	//create statment object
	PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?)");
	//exexcute query
	stmt.setInt(1, 4);
	stmt.setString(2, "govi");
	stmt.setInt(3, 10000000);
	int i=stmt.executeUpdate();
	System.out.println(i +" records insertedd");
	con.close();
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}

