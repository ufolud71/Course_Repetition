package com.repetition_fixed.repetition_fixed;

public class ForumUser extends User{

    private String username;
    private int posts;
    private boolean loggedIn;
    public ForumUser(String name, String lastName, char sex, int age, String username, int posts, boolean loggedIn) {
        super(name, lastName, sex, age);
        this.username = username;
        this.posts = posts;
        this.loggedIn = loggedIn;
    }

    public void introduceUser(){
        System.out.println("User: ");
    }
}
