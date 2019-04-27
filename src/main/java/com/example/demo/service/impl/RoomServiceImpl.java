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
        List<Room> rooms = roomRepository.findRoomsByStatusEquals(true);
        return rooms;
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

    @Override
    public boolean updateRoomDescription(Room room, long roomId) {
        try {
            Room updatedRoom = roomRepository.findRoomsById(roomId);

            room.setId(updatedRoom.getId());

            room.setActive(updatedRoom.isActive());

            roomRepository.save(room);

        }catch (Exception e){
            logger.error(e.toString());
            return false;
        }
        return  true;
    }
}
