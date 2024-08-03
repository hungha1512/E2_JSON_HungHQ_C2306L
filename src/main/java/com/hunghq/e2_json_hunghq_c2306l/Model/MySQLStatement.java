package com.hunghq.e2_json_hunghq_c2306l.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLStatement {
    private static String host = "jdbc:mysql://localhost:3306/shop";
    private static int port = 3306;
    private static String user = "root";
    private static String password = "Hungha15123@";
    private static Connection connection;
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(host, user, password);
        } catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(){
        try{
            connection.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
