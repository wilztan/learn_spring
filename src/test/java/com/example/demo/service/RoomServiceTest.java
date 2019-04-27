package com.example.demo.service;

import com.example.demo.domain.Room;
import com.example.demo.service.impl.RoomServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomServiceTest {

    private RoomService roomService;

    @Before
    public void SetUp(){
        roomService = new RoomServiceImpl();
    }

    @Test
    public void insertNewRoomTest(){
        boolean isInserted = roomService.insertNewRoom(any(Room.class));

        assertThat(isInserted).isTrue();
    }
}
