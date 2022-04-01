import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectSQL {
    public static Connection connectDB() {

        String url = "jdbc:mysql://localhost:3306/hotel";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
        }
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, "root", "Wang0818lin@");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}

