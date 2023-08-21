package users;


import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnection {
    private Connection connection;

    public static Connection DbConnection() {
        try {
            try {
                Class.forName("org.sqlite.JDBC");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection connection = DriverManager.getConnection("jdbc:sqlite:Customer.db");
            System.out.println("Connected to the database.");
            return connection;
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
            return null;
        }
    }

    

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            System.err.println("Error closing the database connection: " + e.getMessage());
        }
    }
}
