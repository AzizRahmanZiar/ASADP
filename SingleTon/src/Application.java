import java.sql.Connection;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        DabaseConnectionManager dbManager=DabaseConnectionManager.getObj();

        try(Connection conn=dbManager.geConnection()){
            if (conn!=null) {
                System.out.println("Successfully connected to the database!");

                String sql="INSERT INTO users (name) VALUES('Aziz Ziar')";
                conn.createStatement().executeUpdate(sql);

                System.out.println("Inserted new user!");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }

        DabaseConnectionManager anotherDbManager=DabaseConnectionManager.getObj();
        System.out.println("Are both objects the same?" + (dbManager==anotherDbManager));
    }
}
