package com.wgcisotto.structural.facade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

//eagely loaded
public class DbSingleton {

    private static volatile DbSingleton instance = null;
    private static volatile Connection conn = null;

    private DbSingleton(){

        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(conn!=null){
            throw  new RuntimeException("Use getInstance() method to create");
        }

        if(instance != null){
            throw  new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        if(Objects.isNull(instance)){
            synchronized (DbSingleton.class){
                if(Objects.isNull(null)){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
        return DriverManager.getConnection(dbUrl);
    }

}