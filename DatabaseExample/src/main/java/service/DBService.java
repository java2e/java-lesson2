package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBService {


    public Connection connection;

    public DBService() {
        getConnection();
    }

    public void getConnection() {
        try {

            connection = DriverManager.getConnection(DBUtil.url, DBUtil.username, DBUtil.password);
        } catch (Exception ex) {

        }
    }

    public ResultSet getResult(String sql) {
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            return statement.executeQuery();
        } catch (Exception ex) {

        }
        return null;
    }
}
