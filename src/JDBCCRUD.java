import java.sql.*;

public class JDBCCRUD {

    public static void main(String[] args) throws SQLException {
        // Load the JDBC driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading JDBC driver: " + e.getMessage());
            System.exit(1);
        }

        // Create a connection to the database
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "password";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a statement
        Statement statement = connection.createStatement();

        // Create a table
        String createTableSQL = "CREATE TABLE users (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255));";
        statement.executeUpdate(createTableSQL);

        // Insert a record
        String insertSQL = "INSERT INTO users (name, email) VALUES ('John Doe', 'johndoe@example.com');";
        statement.executeUpdate(insertSQL);

        // Select all records
        String selectSQL = "SELECT * FROM users;";
        ResultSet resultSet = statement.executeQuery(selectSQL);
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getString("email"));
        }

        // Update a record
        String updateSQL = "UPDATE users SET name = 'Jane Doe' WHERE id = 1;";
        statement.executeUpdate(updateSQL);

        // Delete a record
        String deleteSQL = "DELETE FROM users WHERE id = 1;";
        statement.executeUpdate(deleteSQL);

        // Close the connection
        connection.close();
    }
}
