package com.wgcisotto.structural.adapter;

import org.junit.jupiter.api.Test;

import java.util.List;

public class AdapterTest {

    @Test
    public void run(){
        EmployeeClient client = new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }

}
