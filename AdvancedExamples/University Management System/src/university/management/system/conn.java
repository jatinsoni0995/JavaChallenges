package university.management.system;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s; // with the help of this Statement, I'll execute all SQL queries
    public conn(){  
        try{  
           // Class.forName("com.mysql.jdbc.Driver"); // Registering mySQL driver with forName() method of class 'Class'
            c =DriverManager.getConnection("jdbc:mysql:///ums","root",""); // giving database connectivity URL to DriverManager class -- Connection established
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
