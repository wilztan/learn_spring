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

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }
}
