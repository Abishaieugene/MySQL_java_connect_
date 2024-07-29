package abis;
import java.util.*;
import java.sql.*;
public class Abisheu {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String userName = "root";
		String passWord = "root";
		String query = "select * from john";
		Connection con = DriverManager.getConnection(url, userName, passWord);
		Statement st=con.createStatement();
		ResultSet rs = st.executeQuery(query);
		System.out.println("Connected");
		rs.next();
		System.out.println("StudentId is " + rs.getInt(1));
//		String query = "select * from john";
		System.out.println("StudentName is" + rs.getString(2));
		con.close();
	
	}

}
