package com.wgcisotto.structural.facade;

import java.util.List;

public class FacadeJdbcDemo {

    public static void main(String[] args) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted.");

        final List<Address> address = jdbcFacade.getAddress();

        address.forEach(System.out::println);


    }

}
