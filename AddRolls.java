import java.sql.*;
import java.util.Scanner;

public class AddRolls {
	 {
		 AddRolls.Repit();
	}
	 
	static void Repit()
	{
		try{
			Connection con = JdbcConnection.getConnection();
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("**[ADD NEW JOB ROLL OF ENLOYEE]**");
			
			System.out.println();
			//input employee number
			System.out.print("enter new JOB roll to add: ");
			String nrole = input.next();
			System.out.print("enter employee number: ");
			int enumber = input.nextInt();
					
			
			//creating object of PreparedStatement class and passing parameter (?)
			PreparedStatement stmt=con.prepareStatement("update aprisal_table set new_roll = ? where employeement_number = ?");

			// set the values
			stmt.setString(1, nrole);
			stmt.setInt(2, enumber);
		
			//to execute update
			stmt.executeUpdate();
			System.out.println("***[ ADDING NEW ROLLS SUCCESFULL ]***");
			
		
		}
		catch(Exception e){
			System.out.println("***[ PLEASE ENTER VALID INFORMATION]***");
			
		}
		
		Main.Startlolin();
	}
}
