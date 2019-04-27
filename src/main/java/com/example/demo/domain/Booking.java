package com.example.demo.domain;

public class Booking {

    private Booking booking;

    private Room room;

    private String message;

    public Booking(Booking booking, Room room, String message) {
        this.booking = booking;
        this.room = room;
        this.message = message;
    }
}
