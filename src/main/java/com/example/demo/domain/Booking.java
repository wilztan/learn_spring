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

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
