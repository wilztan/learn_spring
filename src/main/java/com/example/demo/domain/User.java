package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class User extends BaseEntity {

    private String name;

    private String email;

    private long phone;

    private String password;

}
