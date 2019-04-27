package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;

public class Room extends BaseEntity {

    private String roomNumber;

    private int capacity;

    private String facility;

    public Room(String roomNumber, int capacity, String facility) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.facility = facility;
    }
}
