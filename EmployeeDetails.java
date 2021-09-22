
import java.io.DataInputStream;
import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDetails {
	 {
		try{
			String AI,QA,CLOUD,DEVLOPER;
			String currentroll = "intern";
			
			
			Connection con = JdbcConnection.getConnection();
			
			Scanner input = new Scanner(System.in);
			
			
			//input employee number
			System.out.print("Enter Employee number: ");
			int eid = input.nextInt();
			
			
			//input employee sallary
			System.out.print("Enter Employee sallary: ");
			int sal = input.nextInt();
			String sal1 = Integer.toString(sal);
			
			
			//input employee emp_date_of_joining
			System.out.print("Enter Employee date_of_joining: ");
			String dojn =  input.next();
			
			
		
			//department			
			EmployeeDetails.Dept();
			
			
			
			//creating object of PreparedStatement class and passing parameter (?)
			PreparedStatement stmt=con.prepareStatement(" insert into  employeement_details values(?,?,?,?)");

			// set the values
			stmt.setInt(1, eid);
			stmt.setString(2, sal1);
			stmt.setString(3, dojn);
			stmt.setString(4, currentroll);
				

			//to execute update
			stmt.executeUpdate();
			System.out.println("succesfully submitted");
			
			//close the file
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
		Main.Startlolin();
	}
	
	
public static void Dept()
{
	Scanner sc = new Scanner(System.in);
	//input employee department name
	System.out.println("Enter department name: ");
	System.out.println(" 1. AI 2. QA 3.CLOUD 4.DEVLOPER ");
	System.out.println("Enter department number ");
	int newdept = sc.nextInt();
	if(newdept==1)
	{
	String currentroll = "AI";	
	}
	else if(newdept==2)
	{
		String currentroll = "QA";
	}
	else if(newdept==3)
	{
		String currentroll = "CLOUD";
	}
	else if(newdept==4)
	{
		String currentroll = "DEVLOPER";
	}
	else
	{
           System.out.println("invalid option chouse again");
           Dept();
	}
}


}
