package sqlb;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	//step1 load driver class
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//create object connection
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
	//create statment object
	Statement stmt=con.createStatement();
	//exexcute query
	ResultSet r=stmt.executeQuery("select *from employee");
	while(r.next())
		System.out.println(r.getInt(1)+"  "+r.getString(2)+"   "+r.getInt(3));
//close connection object
	con.close();
}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
