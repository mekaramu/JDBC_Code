import java.sql.*;
public class JDBCDemo {
    public static void main(String[] args) {
        Connection con;
        Statement st;
        ResultSet rst;
        try
        {
        //load JDBC Driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("Driver Loaded Successfully");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Unable to load driver");
        }
        try
        {
            //Establishing Connection
         con=DriverManager.getConnection("jdbc:odbc:mydsn","rcr","rcr123");
         //Create Statement
         st=con.createStatement();
         rst=st.executeQuery("Select * from emp");
         System.out.println("Empno           Ename");
         while(rst.next())
         {
             System.out.println(rst.getInt("empno")+"          "+rst.getString("ename"));
           }
         System.out.println("Connected Successfully");
         con.close();
        }

        catch(SQLException e)
        {
System.out.println("Unable to connect");
        }
       
    }

}
