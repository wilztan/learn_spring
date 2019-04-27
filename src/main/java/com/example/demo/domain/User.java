package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;

public class User extends BaseEntity {

    private String name;

    private String email;

    private long phone;

    private String password;

    public User(String name, String email, long phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
