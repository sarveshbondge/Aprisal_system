import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnection {
    
    
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aprisal_system", "root", "asdf@123");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}    


