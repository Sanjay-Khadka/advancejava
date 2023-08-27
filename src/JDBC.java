import java.sql.*;

public class JDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT NOT NULL AUTO_INCREMENT, name VARCHAR(255), email VARCHAR(255), PRIMARY KEY (id));";
            statement.executeUpdate(createTableSQL);


//            String insertSQL = "INSERT INTO users (name, email) VALUES ('sanjay khadka', 'sanjaykhadka@tuicms.edu.np');";
//            statement.executeUpdate(insertSQL);
//
//            // Select all records
//            String selectSQL = "SELECT * FROM users;";
//            ResultSet resultSet = statement.executeQuery(selectSQL);
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getString("email"));
//            }

//             Update a record
            String updateSQL = "UPDATE users SET name = 'Ram Bahadur' WHERE id = 1;";
            statement.executeUpdate(updateSQL);

//             Delete a record
//            String deleteSQL = "DELETE FROM users WHERE id = 2;";
//            statement.executeUpdate(deleteSQL);

            // Close resources
//            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}