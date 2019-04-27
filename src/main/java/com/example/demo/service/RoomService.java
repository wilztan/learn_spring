package com.example.demo.service;

import com.example.demo.domain.Room;

import java.util.List;

public interface RoomService {

    public List<Room> getAllRoom();

    public List<Room> getAllAvailableRoom();

    public boolean insertNewRoom(Room room);

    public boolean updateRoomDescription(Room room, long roomId);

    public boolean removeRoom(long roomId);

}
