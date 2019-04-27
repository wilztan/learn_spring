package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@RequiredArgsConstructor
@Getter
@ToString
public class Booking extends BaseEntity {

    private final Booking booking;

    private final Room room;

    private final String message;

    Booking(){
        this(null,null,null);
    }

}
