
import java.io.DataInputStream;
import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class AprisalDetail {
	 {
		 AprisalDetail.ApDetail();
}
static void ApDetail()
{
	try{
		

		String croll = "intern";
		String nroll = "intern";
		
		
		Connection con = JdbcConnection.getConnection();
		
		Scanner input = new Scanner(System.in);
		
		
		//input employee number
		System.out.print("Enter Employee number: ");
		int eid = input.nextInt();
		
		
		//input employee emp_date_of_joining
		System.out.print("ENTER DATE IN >>>YYYY-DD-MM<<<< FORM ");
		System.out.print("Enter Employee date_of_Aprisal: ");
		String doA =  input.next();
		
		//input employee number of aprisal
		System.out.print("Enter number-of-aprisal: ");
		int aprisal =  input.nextInt();
		
	
		AprisalDetail.newroll();
		//department
		AprisalDetail.currentroll();
		
		
		
		
		//creating object of PreparedStatement class and passing parameter (?)
		PreparedStatement stmt=con.prepareStatement(" insert into  aprisal_table values(?,?,?,?,?)");

		// set the values
		stmt.setInt(1, eid);
		stmt.setString(2, doA);
		stmt.setInt(3, aprisal);
		stmt.setString(4, nroll);
		stmt.setString(5, croll);
			

		//to execute update
		stmt.executeUpdate();
		System.out.println("****[ YOU SUCCESFULLY SUBMITTED DATA");
		
		//close the file
		con.close();
	}
	catch(Exception e){
		//System.out.println(e);
		System.out.println("****[  PLEASE INSERT PROPER INFORMATION]****");
		ApDetail();
		
		
	}
	Main.Startlolin();
}
//current roll



public static void currentroll()
{
Scanner sc = new Scanner(System.in);
//input employee department name
System.out.println("***[ SELECT EMPLOYEE CURRENT ROLE FROM FOLLOWING OPTION]***");
System.out.println();
System.out.println("Enter 1 for intern");
System.out.println("Enter 2 for junior associate");
System.out.println("Enter 3 for senior associate");
System.out.println("Enter 4 for assistant manager");
System.out.println("Enter 5 for manager");
System.out.println("Enter 6 for senior manager");
int newroll = sc.nextInt();
if(newroll==1)
{
	String croll="intern";
}
else if(newroll==2)
{
	String croll="junior associate";
}
else if(newroll==3)
{
	String croll="senior associate";
}
else if(newroll==4)
{
	String croll="assistant manager";
}
else if(newroll==5)
{
	String croll="manager";
}
else if(newroll==6)
{
	String croll="senior manager";
}
else
{
	System.out.println("invalid option try again");
	currentroll();
}
}
public static void newroll()
{
Scanner sc = new Scanner(System.in);
//input employee department name
System.out.println("***[ SELECT EMPLOYEE NEW ROLE FROM FOLLOWING OPTION]***");
System.out.println();
System.out.println("Enter 1 for intern");
System.out.println("Enter 2 for junior associate");
System.out.println("Enter 3 for senior associate");
System.out.println("Enter 4 for assistant manager");
System.out.println("Enter 5 for manager");
System.out.println("Enter 6 for senior manager");
int newroll = sc.nextInt();
if(newroll==1)
{
	String nroll="intern";
}
else if(newroll==2)
{
	String nroll="junior associate";
}
else if(newroll==3)
{
	String nroll="senior associate";
}
else if(newroll==4)
{
	String nroll="assistant manager";
}
else if(newroll==5)
{
	String nroll="manager";
}
else if(newroll==6)
{
	String nroll="senior manager";
}
else
{
	System.out.println("invalid option try again");
	newroll();
}



}

}
