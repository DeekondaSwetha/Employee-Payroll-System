package employee.management.system;
import java.sql.*;


public class Conn {
    public Connection c;
    public Statement s;
    
    public Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3307/employeemanagementsystem","root","12345");
            s = c.createStatement();
        //System.out.println("Database connected successfully!");
        }catch(ClassNotFoundException | SQLException e){
        }
    }
    
}
