package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@RequiredArgsConstructor
@Getter
@ToString
public class Booking extends BaseEntity {

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "rooms.id")
    private final Room room;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "users.id")
    private final User user;

    private final String message;

    Booking(){
        this(null,null,null);
    }

}
