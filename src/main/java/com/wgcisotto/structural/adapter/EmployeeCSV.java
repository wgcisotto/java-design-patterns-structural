package com.wgcisotto.structural.adapter;

import java.util.StringTokenizer;

public class EmployeeCSV {


    private int id;
    private String firstname;
    private String lastName;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ", ");
        if(tokenizer.hasMoreElements()){
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if(tokenizer.hasMoreElements()){
            firstname = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()){
            lastName = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()){
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
