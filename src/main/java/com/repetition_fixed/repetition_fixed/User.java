package com.repetition_fixed.repetition_fixed;

public class User {
    private String name;
    private String lastName;
    private char sex;
    private int age;

    public User(String name, String lastName, char sex, int age){
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public void logIn(){
        System.out.println("Jebać psy");
    }
    public void deleteAccount(){
        System.out.println("Account has been deleted");
    }

    public void getName2(){
        System.out.println(name);
    }
    public void getName() {
        System.out.println(this.name);
    }

    public String getLastName() {
        return this.lastName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}
