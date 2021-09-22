import java.sql.*;
import java.util.Scanner;

public class GetEmployee 
{
	{
		
		
		GetEmployee.repit();
		
      }
	
static void repit()
{
	try {
		 Connection con = JdbcConnection.getConnection();
		 
		 System.out.println("*****[  GIVE EMPLOYEE NUMBER TO SEE INFORMATION ]******");
		 System.out.println();
		 System.out.println("EMPLOYEE NUMBER = ");
       Scanner sc = new Scanner(System.in);
       int enumber = sc.nextInt();
		PreparedStatement stmt=con.prepareStatement("SELECT t1.employeement_number,t2.emp_first_name,t2.emp_middle_name,t2.emp_last_namber,t2.emp_Age,t2.emp_Address,t2.mobile_number\r\n"
       		+ ", t1.current_roll,t1.appraisal_date,t3.emp_salary,t3.emp_date_of_joining\r\n"
       		+ "FROM aprisal_table as t1\r\n"
       		+ "LEFT JOIN  employee_persnal_detail as t2 \r\n"
       		+ "ON t1.employeement_number = t2.employeement_number\r\n"
       		+ "LEFT JOIN employeement_details as t3 \r\n"
       		+ "ON t1.employeement_number = t3.employeement_number\r\n"
       		+ "WHERE t1.employeement_number= ?;");

		stmt.setInt(1, enumber);		
       ResultSet rs = stmt.executeQuery();
    
       //System.out.println("EmpId, Salary, Name");
     
       while(rs.next())
       {
           System.out.println(" employment number = "+rs.getString(1) + "\n "+ "Name = "+ rs.getString(2)+" "+rs.getString(3)+" "+ rs.getString(4) + " \n"+ " age = "+rs.getString(5) + "\n "+ "Address = "+rs.getString(6) + "\n "+ "mobile number = "+rs.getString(7) + "\n "+ "currient roll = "+rs.getString(8) + "\n "+ "Aprisal data "+rs.getString(9) + "\n "+ "salary = "+rs.getString(10) + "\n "+ "date of joining = "+rs.getString(11) );
           
       }
       System.out.println();
		System.out.println();
		System.out.println();
      
		}catch(Exception e)
		{
			System.out.println("**[ENTER VALID VALUE]**");
			repit();
		}
	Main.Startlolin();
}

}