package beans;
import java.sql.Connection;
import java.sql.DriverManager;
public class connectionBean 
{
         public connectionBean(){}
            
         public Connection getConnection() 
         {
           Connection con=null;
           try 
           {   
             Class.forName("com.ibm.db2.jcc.DB2Driver");   
           //con = DriverManager.getConnection("jdbc:microsoft:sqlserver://172.20.0.99:1433;DatabaseName=STUDENT;User=sa;Password=abc");   
            // con = DriverManager.getConnection("jdbc:microsoft:sqlserver://172.20.0.99:1433;DatabaseName=STUDENT;SelectMethod=Cursor;User=sa;Password=abc");
             //con = DriverManager.getConnection("jdbc:db2://172.20.0.99:50000/AOD","db2admin","admindb2");
             //con = DriverManager.getConnection("jdbc:db2://172.19.0.159:50000/AOD","db2admin","admindb2");
             con = DriverManager.getConnection("jdbc:db2://172.20.10.38:50000/AOD","db2admin","admindb2");
             return con;       
           }
           catch (ClassNotFoundException e) 
           {
             System.out.println(e.toString());
           }
           catch (Exception e) 
           {
             System.out.println ("Exception Handled" + e);
           }
           return con;
         }
}

