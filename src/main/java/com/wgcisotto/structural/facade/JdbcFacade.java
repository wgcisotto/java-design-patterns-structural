package com.wgcisotto.structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcFacade {

    DbSingleton instance = null;

    public JdbcFacade(){
        instance = DbSingleton.getInstance();
    }

    public int createTable(){
        int count = 0;
        try(Connection conn = instance.getConnection();
                Statement sta = conn.createStatement()){

            count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, " +
                    " StreetName VARCHAR(20), City VARCHAR(20))");

        }catch (Exception ex){
            System.out.println("Error to create table");
        }
        return count;
    }

    public int insertIntoTable(){
        int count = 0;
        try(Connection conn = instance.getConnection();
            Statement sta = conn.createStatement()){

            count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) values" +
                    "(1, '1234', 'Some street Layton')");

        }catch (Exception ex){
            System.out.println("Error inserting into the table");
            System.out.println(ex.getMessage());
        }
        return count;
    }

    public List<Address> getAddress(){
        List<Address> addresses = new ArrayList<>();
        try(Connection conn = instance.getConnection();
            Statement sta = conn.createStatement()){

            ResultSet rs = sta.executeQuery("SELECT * FROM Address");

            while (rs.next()){
                Address address = new Address();
                address.setId(rs.getString(1));
                address.setStreetName(rs.getString(2));
                address.setCity(rs.getString(3));
                addresses.add(address);
            }

        }catch (Exception ex){
            System.out.println("Error selecting info from the database");
            System.out.println(ex.getMessage());
        }
        return addresses;
    }

}
