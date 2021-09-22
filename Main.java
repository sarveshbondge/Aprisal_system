import java.sql.Connection;
import java.util.Scanner;

public class Main {

	 public static void main(String args[])
	 
	{
	    Connection con = JdbcConnection.getConnection();
		Login log = new Login();
		log.getClass();
	}
	
 static void Startlolin()
 {
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println("**************************************************");
	    System.out.println("*******[  T - COMPANY APRISAL SYSTEM   ]**********");
		System.out.println();
		System.out.println("*******[  select option from following ]**********");
		System.out.println();
		System.out.println("*******[  select 1 for new employee    ]**********");
		System.out.println("*******[  select 2 for  HR login       ]**********");
		System.out.println("*******[  select 0 for new exit        ]**********");
		System.out.println("**************************************************");
        System.out.println();
	    System.out.print("           ENTER VALUE = ");
	    System.out.println();
	 Scanner sc = new Scanner(System.in);
		int firstlogin = sc.nextInt();
		
		
		if(firstlogin==1)
		{
			System.out.println("*******[  WELLCOME OF APRISAL SYSTE ");
			System.out.println("*******[  PLEASE GIVE YOUR PROPER INFORMATON ");
			System.out.println("*******[  PLEASE REMAMBER YOUR EMPLOYEEMENT NUMBER TO AVOID FUTURE CONSIQUENCES ");
			AddEmployee addemp = new AddEmployee();
			addemp.getClass();
		}
		
		
		
		
		
		
		
		else if(firstlogin==2)
		{
			
			 ShowallDetailsOfEmployee obj7 = new ShowallDetailsOfEmployee();
			 obj7.getClass();
			 System.out.println();
			 System.out.println();
			 System.out.println();
			 System.out.println();
			 
			System.out.println("*******[  WELLCOME HR TO APRISAL SYSTEM                                ]****** ");
			System.out.println();
			System.out.println("*******[  select option from following                                 ]*****");
			System.out.println();
			System.out.println("*******[  SELECT 1 FOR ADDING NEW APRISAL DETAIL                       ]*******");
			System.out.println("*******[  SELECT 2 FOR TO GIVE FEEDBACK AND PERFORMANCE TO EMPLOYEE    ]*******");
			System.out.println("*******[  SELECT 3 FOR MANUALY ADD EMPLOYEE NEW ROLLS                  ]*******");
			System.out.println("*******[  SELECT 4 FOR DELETING EMPLOYEE ROLLS IN COMPANY              ]*******");
			System.out.println("*******[  SELECT 5 TO SEE EMPLOYEE DETAILS                             ]*******");
			System.out.println("*******[  SELECT 0 TO EXIT                                             ]*******");
			
			 
			System.out.println("ENTER VALUE = ");
				int number = sc.nextInt();
				
				if(number==1)
				{
					System.out.println("*******[  ADD EMPLOYEE APRASIAL DETAIL ]*****");
					System.out.println();
					AprisalDetail obj3 = new AprisalDetail();
					obj3.getClass();
				}
				else if(number==2)
				{
					EmployeeAprisal obj5 = new EmployeeAprisal();
					obj5.getClass();
				}
				else if(number==3)
				{
					AddRolls obj5 = new  AddRolls();
					obj5.getClass();
				}
				else if(number==4)
				{
					DeleteRolls obj6 = new DeleteRolls();
					obj6.getClass();
				}
				else if(number==5)
				{
					repit();
					
				}
				else if(number==0)
				{
					System.out.println(" *****[ THANCK YOU COME AGAIN ]*****");
					Startlolin();
				}
				else
				{
					System.out.println("***[INVALID OPTION]***");
					Startlolin();
				}
				
			
		}	
		
		else if(firstlogin==0)
		{
			System.out.println("*******[     THANK YOU FOR USING APRISAL SYSTEM     ]*******");
			System.exit(0);
		}
		else
		{
			System.out.println("*******SORRY! PLEASE GIVE VALID INPUT*****");
			System.out.println("ENTER VALUE = ");
			Startlolin();
		}
		
 }
 static void repit()
	{
	 System.out.println("***[  THE EMPLPOYEE DETAILS ARE FOLLOWING ]****");
		GetEmployee obj4 = new GetEmployee();
		obj4.getClass();
		repit();
	}
 
}

