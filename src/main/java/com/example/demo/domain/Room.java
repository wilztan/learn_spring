package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Room extends BaseEntity {

    private String roomNumber;

    private int capacity;

    private String facility;

}
