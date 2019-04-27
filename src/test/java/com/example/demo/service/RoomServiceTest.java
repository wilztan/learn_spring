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

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomServiceTest {

//    @Autowired
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

        List<Room> roomMock = new ArrayList<Room>();
        roomMock.add(new Room("LNT A",8, "10 Macbooks", true));

        given(roomRepository.findRoomsByStatusEquals(true)).willReturn(roomMock);

        List<Room> rooms = roomService.getAllAvailableRoom();

        int counter = 0;

        for (Room room : rooms ) {
            if (!room.isStatus())
                counter++;
            System.out.println(room.getRoomNumber());
        }

        assertThat(counter).isLessThan(1);
    }

    @Test
    public void updateRoomDescriptionTest(){

        given(roomRepository.findRoomsById(1)).willReturn(new Room("LNT D",10,"10 IMac",true));

        Room roomSample = new Room("LNT A", 80, "10 Macbooks", true);

        boolean isUpdated = roomService.updateRoomDescription(roomSample, 1);

        assertThat(isUpdated).isTrue();
    }
}
