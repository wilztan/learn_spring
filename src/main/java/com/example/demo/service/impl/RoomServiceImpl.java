package com.example.demo.service.impl;

import com.example.demo.domain.Room;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    public RoomServiceImpl(){

    }

    @Override
    public List<Room> getAllAvailableRoom() {
        return null;
    }

    @Override
    public boolean insertNewRoom(Room room) {
        return  false;
    }
}
