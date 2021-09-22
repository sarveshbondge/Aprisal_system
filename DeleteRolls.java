import java.sql.*;
import java.util.Scanner;

public class DeleteRolls {
	 {
		try{
			Connection con = JdbcConnection.getConnection();
			
			Scanner input = new Scanner(System.in);
			
			
			
			System.out.println("****[ DELETE EMPLOYEE ROLLES]****"); 
		
			System.out.print("enter employee number");
			int enumber = input.nextInt();
			
			System.out.println("enter 0 to delete current roll role");
			System.out.println("enter 1 to delete old roll role");
			Scanner sc = new Scanner(System.in);
		    int newval = sc.nextInt(); 
		    if( newval==0)
		    {
		    	//creating object of PreparedStatement class and passing parameter (?)
		    	PreparedStatement stmt=con.prepareStatement("update aprisal_table set new_roll = 'intern' where employeement_number = ?");
		    	// set the values
				stmt.setInt(1, enumber);
				//to execute update
				stmt.executeUpdate();
				System.out.println("ok");
		    }
		    else
		    {
		    	//creating object of PreparedStatement class and passing parameter (?)
		    	PreparedStatement stmt=con.prepareStatement("update aprisal_table set current_roll = 'intern' where employeement_number = ?");
		    	// set the values
				stmt.setInt(1, enumber);
				//to execute update
				stmt.executeUpdate();
				System.out.println("***[ SUCCESFULLY REMOVED]***");
		    }	
			//close the file
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		Main.Startlolin();
	}
}
