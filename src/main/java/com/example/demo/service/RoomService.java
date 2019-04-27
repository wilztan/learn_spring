package com.example.demo.service;

import com.example.demo.domain.Room;

import java.util.List;

public interface RoomService {

    public List<Room> getAllAvailableRoom();

    public boolean insertNewRoom(Room room);

}
