package com.example.Spring2.ModelClasses;

public class Person2 {
    private String name;
    private int age;
    private int password;
    private int AccountNumber;

    public Person2() {
    }

    public Person2(String name, int age, int password, int accountNumber) {
        this.name = name;
        this.age = age;
        this.password = password;
        AccountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }
}
