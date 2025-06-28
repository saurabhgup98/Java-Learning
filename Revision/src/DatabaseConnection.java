import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public Connection getConnection(){
        try {
            //1. Load the H2 Driver class
            Class.forName("org.h2.Driver");
            return DriverManager.getConnection("jdbc:h2:mem:userDB", "sa", "");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
