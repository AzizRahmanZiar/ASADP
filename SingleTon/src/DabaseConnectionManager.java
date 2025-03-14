import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DabaseConnectionManager {
    private static DabaseConnectionManager obj;
    private Connection connection;
    private final String url="jdbc:mysql://localhost:3306/sd";
    private final String user="root";
    private final String password="";
    
    private DabaseConnectionManager(){
        try{
            connection=DriverManager.getConnection(url, user, password);
            System.out.println("connected!");
        }catch(SQLException e){
            e.getStackTrace();
        }     
    }
    public static DabaseConnectionManager getObj(){
        if (obj==null) {
            obj=new DabaseConnectionManager();
        }
        return obj;
    }
    public Connection geConnection(){
        return connection;
    }
}