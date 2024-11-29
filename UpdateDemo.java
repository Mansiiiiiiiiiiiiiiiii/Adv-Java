import java.sql.*;

public class UpdateDemo {
    // Make these fields static if you want to use them in the static method
    static String city1 = "Pune";
    static String email1 = "palaksahu@gmail.com";

    public static void main(String[] args) {
        // Connection and database info
        String url = "jdbc:mysql://localhost:3306/jdbc_db";
        String username = "root";
        String password = "";

        // SQL query for update
        String sql = "UPDATE register SET city=? WHERE email=?";

        // Use try-with-resources to ensure resources are closed properly
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Set parameters in the PreparedStatement
            ps.setString(1, city1);  // city
            ps.setString(2, email1); // email

            // Execute the update query
            int count = ps.executeUpdate();
            if (count > 0) {
                System.out.println("Update successful");
            } else {
                System.out.println("Update failed");
            }

        } catch (SQLException e) {
            // Handle any SQL errors
            e.printStackTrace();
        }
    }
}
