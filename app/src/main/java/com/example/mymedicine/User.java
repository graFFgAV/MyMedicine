package com.example.mymedicine;

public class User {
    public String id,sec_name, name, image;

    public User() {
    }

    public User(String id, String name, String sec_name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.sec_name = sec_name;
    }
}