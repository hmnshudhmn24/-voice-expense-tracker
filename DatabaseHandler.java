import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseHandler {
    private static final String URL = "jdbc:sqlite:expenses.db";

    public static void initializeDatabase() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            String sql = "CREATE TABLE IF NOT EXISTS expenses (id INTEGER PRIMARY KEY, category TEXT, amount REAL)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
            System.out.println("Database initialized.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}