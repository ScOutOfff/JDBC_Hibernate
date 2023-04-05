package com.devcolibri.database;

import java.sql.*;

public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/mydbtext";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    public DBWorker() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
