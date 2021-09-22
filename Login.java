  
import java.sql.*;   
import java.util.*;  
public class Login {  
 { 
	  try {
		 Connection con = JdbcConnection.getConnection();
		 
		  Statement stmt = con.createStatement();  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("********************************************");
		  System.out.print("            Enter the user id  : ");  
		  String str1 = sc.next();  
		  System.out.print("            Enter the password : "); 
		  String str2 = sc.next(); 
		  ResultSet rs = stmt.executeQuery("select * from login where user='" + str1 + "' and password='" + str2 + "'");  
		  if (rs.next())  
			  Main.Startlolin();  
		  else  
		   System.out.println("Invalid user name and password");  
		  con.close();
		  stmt.close();
		  
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
		
		
	} 

 }


  
