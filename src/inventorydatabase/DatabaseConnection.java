/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorydatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class DatabaseConnection {
    // JDBC URL, username, and password of PostgreSQL server

    private static final String URL = "jdbc:postgresql://localhost:5432/inventory_db";
    private static final String USER = "stanza_narib";
    private static final String PASSWORD = "123456789";

    // Singleton instance of the connection
    private static Connection connection;

    // Private constructor to prevent instantiation
    private DatabaseConnection() {
    }

    /**
     * Establishes a connection to the PostgreSQL database.
     *
     * @return the established Connection object.
     * @throws SQLException if the connection cannot be established.
     */
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                // Register the PostgreSQL JDBC driver (not needed for newer versions of JDBC)
                // Class.forName("org.postgresql.Driver");

                // Open a new connection
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (SQLException e) {
                throw new SQLException("Error while connecting to the database.", e);
            }
        }
        return connection;
    }

    /**
     * Closes the connection to the database.
     */
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
