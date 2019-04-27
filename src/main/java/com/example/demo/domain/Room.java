package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Room extends BaseEntity {

    private final String roomNumber;

    private final int capacity;

    private final String facility;

    private final boolean status;

    Room(){
        this(null,0,null,false);
    }

}
