package university.management.system;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Database {

    Connection connection;
    Statement statement;

    public Database(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/university_management_system","root","Swayam@160905");
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
}
