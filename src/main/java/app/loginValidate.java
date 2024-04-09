package app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class loginValidate 
{
	public static boolean regi(String name,String pword)
	{
		boolean flag=false;
		Connection conn;
		String url="jdbc:mysql://localhost:3306/student",uname="shariq",pwd="root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn = DriverManager.getConnection(url,uname,pwd);
			Statement st = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement("insert into login values(?,?)");
			ps.setString(1,name);
			ps.setString(2,pword);
			ps.executeUpdate();  
			conn.close();
			flag=true;
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static boolean Val(String uname ,String pword)
	{
    	boolean flag=false;
    	String url="jdbc:mysql://localhost:3306/student",name="shariq", pwd="root";
    	try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection	con=DriverManager.getConnection(url,name,pwd);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student.login");
			while(rs.next()){
				String n=rs.getString("unamme");
				String p=rs.getString("pword");
				System.out.println(n+" "+p);
				if(n.equals(uname) && p.equals(pword)) {
					System.out.println(uname+" "+pword);
					flag = true;
				}
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("end closed!");
    	if(flag)
    		System.out.println("s");
    	else
    		System.out.println("no");
    	return flag;
	}
}
