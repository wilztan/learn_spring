package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@RequiredArgsConstructor
@Getter
@ToString
public class User extends BaseEntity {

    private final String name;

    private final String email;

    private final long phone;

    private final String password;

    User(){
        this(null,null,0L,null);
    }

}
