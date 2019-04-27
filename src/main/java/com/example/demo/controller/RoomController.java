package com.example.demo.controller;

import com.example.demo.domain.Room;
import com.example.demo.domain.base.BaseDto;
import com.example.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<BaseDto> fetchAllRoom(){

        List<Room> rooms = roomService.getAllRoom();

        return  ResponseEntity.ok(
                new BaseDto(
                        generateRoomResult(rooms),
                        true,
                        200
                )
        );
    }

    @RequestMapping(method = RequestMethod.GET,path = "/available")
    ResponseEntity<BaseDto> fetchAllAvailableRoom(){

        List<Room> rooms = roomService.getAllAvailableRoom();

        return  ResponseEntity.ok(
                new BaseDto(
                        generateRoomResult(rooms),
                        true,
                        200
                )
        );
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<BaseDto> insertNewRoom(@RequestBody Room room){
        boolean result = roomService.insertNewRoom(room);

        return ResponseEntity.ok(
                new BaseDto(null,result,200)
        );
    }

    @RequestMapping(method = RequestMethod.PUT)
    ResponseEntity<BaseDto> updateRoom(@RequestBody Room room, @RequestParam("roomId") long roomId){
        boolean result = roomService.updateRoomDescription(room,roomId);

        return ResponseEntity.ok(
                new BaseDto(null,result,200)
        );
    }

    @RequestMapping(method = RequestMethod.DELETE)
    ResponseEntity<BaseDto> deleteRoom(@RequestParam("roomId") long roomId){
        boolean result = roomService.removeRoom(roomId);

        return ResponseEntity.ok(
                new BaseDto(null,result,200)
        );
    }

    private Object generateRoomResult(List<Room> rooms){
        Map<String, Object> resultMap = new HashMap<String, Object>();

        resultMap.put("rooms" , rooms);

        resultMap.put("count" , rooms.size());

        return  resultMap;
    }

}
