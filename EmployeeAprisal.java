import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeAprisal{

	{
		EmployeeAprisal.repit();
		
	}
static void repit()
{
	try{
		String position = null;
		Connection con = JdbcConnection.getConnection();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter  employee number: ");
		int enumber = input.nextInt();
		
		PreparedStatement stmt=con.prepareStatement("Select current_roll from aprisal_table where  employeement_number = ?");	
		stmt.setInt(1, enumber);
		
		ResultSet rs = stmt.executeQuery();
		   while(rs.next())
	        {

			   position =rs.getString(1);
	            
	        }
		  
		
		
		//input employee number
		System.out.println("[******************welcome to employee aprisal");
		System.out.println("[**give feedback and perfomance for genrating new positoin to employee");
		System.out.println("[***************welcome  to employee aprisal system");
		System.out.println();
		System.out.print("press 1 to start procedure  =");
		
		Scanner sc = new Scanner(System.in);
		int inputdata = sc.nextInt();
		if(inputdata==1)
		{
			ArrayList<String> Jobroll = new ArrayList<String>();
			Jobroll.add("intern");//0
			Jobroll.add("junior associate");//1
			Jobroll.add("senior associate");//2
			Jobroll.add("assistant manager");//3
			Jobroll.add("manager");//4
			Jobroll.add("senior manager");//5
		   
			System.out.println();
			System.out.println("Enter feedback from given option for employee");
			System.out.println();
			System.out.println("press 1 to give feedback low");
			System.out.println("press 2 to give feedback normal");
			System.out.println("press 3 to give feedback avrage");
			System.out.println("press 4 to give feedback good");
			System.out.println("press 5 to give feedback best");
			System.out.println("ENTER VALVE : ");
			int feedback = sc.nextInt();
			System.out.println();
			System.out.println("WOW! thanck you for your prestigious feedback");
			System.out.println();
			System.out.println("select employee performance from given option");
			System.out.println();
			System.out.println("press 1 to give feedback avrage");
			System.out.println("press 2 to give feedback good");
			System.out.println("press 3 to give feedback best");
			System.out.println("ENTER VALVE : ");
			System.out.println();
			int performance  = sc.nextInt();
			System.out.println("WOW! thanck you for your performance and feedback");
			System.out.println();
			
			   
			   if(feedback==1 && performance==1||feedback==1 && performance==2||feedback==1 && performance==3
				||feedback==2 && performance==1||feedback==2 && performance==2||feedback==2 && performance==3
				||feedback==3 && performance==1||feedback==3 && performance==2	)
			         {
				  
				System.out.println("**[ from feedback and performance  position of employee remain  same ]**");					
			         }
			  
			   else if(feedback==4 && performance==3||feedback==5 && performance==3)
			   {
				   if(position == Jobroll.get(0))
				   position = Jobroll.get(2);
				   else if(position == Jobroll.get(1))
				   position = Jobroll.get(3);
				   else if(position == Jobroll.get(2))
				   position = Jobroll.get(4);
				   else if(position == Jobroll.get(3))
					   position = Jobroll.get(5);
				   else if(position == Jobroll.get(4))
					   position = Jobroll.get(5);
				   else if(position == Jobroll.get(5))
					   position = Jobroll.get(5);
				   
				   PreparedStatement stmt2=con.prepareStatement("update aprisal_table set new_roll = ? where employeement_number = ?");
			    	// set the values
					stmt2.setString(1, position);
					stmt2.setInt(2, enumber);
					//to execute update
					stmt.executeQuery();
					System.out.println(" ***[  thanck you for your performance and  feedback employee is promoted to next to next lavel ]***");
				   
			   }   
			   else
			   {
				   if(position == Jobroll.get(0))
					   position = Jobroll.get(1);
					   else if(position == Jobroll.get(1))
					   position = Jobroll.get(2);
					   else if(position == Jobroll.get(2))
					   position = Jobroll.get(3);
					   else if(position == Jobroll.get(3))
						   position = Jobroll.get(4);
					   else if(position == Jobroll.get(4))
						   position = Jobroll.get(5);
					   else if(position == Jobroll.get(5))
						   position = Jobroll.get(5);
				   
				   PreparedStatement stmt3=con.prepareStatement("update aprisal_table set new_roll = ? where employeement_number = ?");
			    	// set the values
					stmt3.setString(1, position);
					stmt3.setInt(2, enumber);
					//to execute update
					stmt.executeQuery();
					System.out.println(" ***[  thanck you for your performance and  feedback employee is promoted to next lavel  ]**");
					System.out.println();
					System.out.println();
					
			   }
		}
		
		    	
		
		

	}
	catch(Exception e){
		
		System.out.println("***[ ENTER VALID INPUT ]***");
		repit();
	}
	Main.Startlolin();
}
}
