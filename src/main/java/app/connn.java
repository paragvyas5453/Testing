package app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Statement;

public class connn {
    static Connection conn;
    static Statement st;
    static PreparedStatement ps;
    static String url="jdbc:mysql://localhost:3306/student",uname="shariq", pword="shariq";
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,uname,pword);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
}
