package abis;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/eug";
        String userName = "root";
        String passWord = "root";
        String query = "SELECT * FROM john";
        Connection con = DriverManager.getConnection(url, userName, passWord);
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        System.out.println("Connected");
        while (rs.next()) {
            System.out.println("StudentId is " + rs.getInt("StudentID"));
            System.out.println("StudentName is " + rs.getString("StudentName"));
            System.out.println("Age is " + rs.getInt("Age"));
            System.out.println("City is " + rs.getString("City"));
        }
        
        con.close();
    }
}

