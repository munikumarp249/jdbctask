package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectionUtil
{
    private static final String DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/student_jdbc";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "Muni123@";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
    }

}