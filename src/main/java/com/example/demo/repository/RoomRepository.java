package com.example.demo.repository;

import com.example.demo.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {

    public List<Room> findRoomsByActiveIsTrueAndStatusEquals(boolean status);

    public Room findRoomByActiveIsTrueAndIdEquals(long id);
}
