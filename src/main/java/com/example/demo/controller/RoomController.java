package com.example.demo.controller;

import com.example.demo.domain.Room;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<Object> insertNewRoom(@RequestBody Room room){
        boolean result = roomService.insertNewRoom(room);

        return ResponseEntity.ok(
                result
        );
    }
}
