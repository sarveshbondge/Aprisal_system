
import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class AddEmployee 
{
	{
		AddEmployee.Empdata();
	}
static void Empdata()
{
	try{
		Connection con = JdbcConnection.getConnection();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("*******[  NEW EMPLOYEE INFORMATION     ]*******");
		System.out.println();
		
		//input employee number
		System.out.print("Enter Employee Number:= ");
		int eid = input.nextInt();
		
		
		//input employee name
		System.out.print("Enter Employee first Name:= ");
		String enamefirst=input.next().trim();
		
		//input employee middle name
		System.out.print("Enter Employee middle Name:= ");
		String enamemiddle=input.next().trim();
		
		//input employee last name
		System.out.print("Enter Employee last Name:= ");
		String enamelast=input.next().trim();
		
		
		//input employee age
		System.out.print("Enter Employee age:= ");
		int age=input.nextInt();
		
		
		//input employee address
		System.out.print("Enter Employee Address:= ");
		String eaddress=input.next().replace(" ", "_").trim();
		
		//input employee Date Of Birth
		System.out.print("Enter Employee Date Of Birth:= ");
		String edob=input.next().trim();
		
		//input employee mobile
		System.out.print("Enter Employee mobile number:= ");
		long mobile=input.nextLong();
		
		
		//creating object of PreparedStatement class and passing parameter (?)
		PreparedStatement stmt=con.prepareStatement("insert into  employee_persnal_detail values(?,?,?,?,?,?,?,?)");

		// set the values
		stmt.setInt(1, eid);
		stmt.setString(2, enamefirst);
		stmt.setString(3, enamemiddle);
		stmt.setString(4, enamelast);
		stmt.setInt(5, age);
		stmt.setString(6, eaddress);
		stmt.setString(7, edob);
		stmt.setLong(8, mobile);
				

		//to execute update
		stmt.executeUpdate();
		System.out.println("*********[ YOU SCCCESFULLY ADDED YOUR INFORMATION]*********");
		System.out.println();
		System.out.println();
		System.out.println();
	
	}
	catch(Exception e){
	//	System.out.println(e);
		System.out.println("*********[ PLEASE ENTER PROPER VALUE]*********");
		System.out.println("*********[ CHANGE EMPLOYEEMENT NUUMBER IT MAY BE ANOTHER ONE ]*********");
		
		Empdata();
		
	}
	Main.Startlolin();
}
}
