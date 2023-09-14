import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/newdb";
            String USER = "developer";
            String PASSWORD = "passwordhere";
            conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Connected to database successfully! : "+conn.getCatalog());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                ;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}