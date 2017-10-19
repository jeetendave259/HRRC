package beans;
import java.sql.*;

public class connectionBeanTUO {

  public connectionBeanTUO(){
}
            
 public Connection getConnection() {
  Connection con=null;
  try {

   Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
    con = DriverManager.getConnection("jdbc:microsoft:sqlserver://172.20.10.38:1433;DatabaseName=TUO;SelectMethod=Cursor;User=sa;Password=abc");
    
                        return con;
  }
  catch (ClassNotFoundException e) {
   System.out.println(e.toString());
  }
  catch (Exception e) {
     System.out.println ("Exception Handled" + e);
  }

  return con;
 }
 
}

