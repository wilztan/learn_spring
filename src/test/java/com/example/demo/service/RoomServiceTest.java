package com.example.demo.service;

import com.example.demo.domain.Room;
import com.example.demo.repository.RoomRepository;
import com.example.demo.service.impl.RoomServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomServiceTest {

    @Autowired
    private RoomService roomService;

    @Mock
    private RoomRepository roomRepository;

    @Before
    public void SetUp(){
        roomService = new RoomServiceImpl(roomRepository);
    }

    @Test
    public void insertNewRoomTest(){

        Room roomSample = new Room("LNT A", 8, "10 Macbooks", true);
        System.out.println(roomSample.toString());

        boolean isInserted = roomService.insertNewRoom(roomSample);

        assertThat(isInserted).isTrue();
    }

    @Test
    public void getAllAvailableRoomTest(){
        List<Room> rooms = roomService.getAllAvailableRoom();

        int counter = 0;

        for (Room room : rooms ) {
            if (!room.isStatus())
                counter++;
        }

        assertThat(counter).isLessThan(1);
    }
}
