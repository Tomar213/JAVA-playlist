package first;
// import java.io.*; 
import java.sql.*;

public class Jdbc {
	public static void main(String[] args) throws InstantiationException ,IllegalAccessException , ClassNotFoundException , 
	SQLException
	{
		String url ="jdbc:mysql://localhost:3306/my_database";
		String user = "root";
		String password = "0000";
		String query ="select E_name  from emp2 where E_no = 39";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString(1);
	System.out.println(name);
		st.close();
		con.close();
	System.out.println("Query executed ............");
	}

}
  