import java.sql.*;
import java.sql.Connection;

public class ShowallDetailsOfEmployee
{
{
	try{
	{
		
		Connection con = JdbcConnection.getConnection();   
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery("SELECT t1.employeement_number,t2.emp_first_name,t2.emp_middle_name,t2.emp_last_namber,t2.emp_Age,t2.emp_Address,t2.mobile_number\r\n"
           		+ ", t1.current_roll,t1.appraisal_date,t3.emp_salary,t3.emp_date_of_joining\r\n"
           		+ "FROM aprisal_table as t1\r\n"
           		+ "LEFT JOIN  employee_persnal_detail as t2 \r\n"
           		+ "ON t1.employeement_number = t2.employeement_number\r\n"
           		+ "LEFT JOIN employeement_details as t3 \r\n"
           		+ "ON t1.employeement_number = t3.employeement_number");
     
       // System.out.println("employeement_number            ,emp_nam                 emp_Age,                emp_Address,                     mobile_number");
      
        while(rs.next())
        {
        	
            System.out.println(" employment number = "+rs.getString(1) + "       "+ "Employee Name = "+ rs.getString(2)+" "+rs.getString(3)+" "+ rs.getString(4) + "          "+ " age = "+rs.getString(5) + "          "+ "Address = "+rs.getString(6) + "           "+ "mobile number = "+rs.getString(7) + "                 "+ "currient roll = "+rs.getString(8) + "                  "+ "Aprisal data "+rs.getString(9) + "                   "+ "salary = "+rs.getString(10) + "                "+ "date of joining = "+rs.getString(11) );
            System.out.println("***************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        }
     
	}
	}catch(Exception e)
	{
		
	}

}
}