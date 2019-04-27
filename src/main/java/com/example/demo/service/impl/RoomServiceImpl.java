package com.example.demo.service.impl;

import com.example.demo.domain.Room;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.RoomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private Logger logger = LoggerFactory.getLogger(RoomServiceImpl.class);

    private RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository){
        this.roomRepository = roomRepository;

    }

    @Override
    public List<Room> getAllAvailableRoom() {
        return null;
    }

    @Override
    public boolean insertNewRoom(Room room) {
        try {
            // logic for insert new room
            roomRepository.save(room);

        }catch (Exception e){
            logger.error(e.toString());
            return false;
        }
        return true;
    }
}
