import java.sql.*;

public class InsertDemo {
    public static void main(String[] args) {
        // JDBC URL, username, and password for MySQL database
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "password";

        // SQL query with placeholders
        String sql = "INSERT INTO register (name, email, password, gender, city) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Set the values for the placeholders
            ps.setString(1, "Palak");
            ps.setString(2, "palaksahu@gmail.com");
            ps.setString(3, "palak");
            ps.setString(4, "Female");
            ps.setString(5, "Indore");

            // Execute the insert query
            int i = ps.executeUpdate();

            // Check if the insert was successful
            if (i > 0) {
                System.out.println("Success: Data inserted successfully.");
            } else {
                System.out.println("Fail: Data insertion failed.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
