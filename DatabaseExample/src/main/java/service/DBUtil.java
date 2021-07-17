package service;

import java.sql.*;

public class DBUtil {

    public static String url = "jdbc:postgresql://127.0.0.1:5433/dvdrental"; // jdbc url
    public static String username = "postgres";
    public static String password = "root";
    public static Connection connection = null;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.out.println(ex.getCause());
        }
        return connection;
    }

    public static ResultSet getResult(String sql) {
        try {
            if (connection.isClosed())
                getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            return statement.executeQuery();
        } catch (Exception ex) {

        }

        return null;

    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
