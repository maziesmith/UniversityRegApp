package com.example.vincentwabwoba.kcaapp;

public class Student {
    private String id;
    private String fullnames;
    private String email;
    private String password;


    public Student(String id, String fullnames, String email, String password) {
        this.id = id;
        this.fullnames = fullnames;
        this.email = email;
        this.password = password;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
