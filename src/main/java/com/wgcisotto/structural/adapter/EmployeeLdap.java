package com.wgcisotto.structural.adapter;

public class EmployeeLdap {

    private String cn;
    private String surname;
    private String giverName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String giverName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.giverName = giverName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGiverName() {
        return giverName;
    }

    public void setGiverName(String giverName) {
        this.giverName = giverName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
