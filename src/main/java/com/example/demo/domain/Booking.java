package com.example.demo.domain;

import com.example.demo.domain.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Booking extends BaseEntity {

    private Booking booking;

    private Room room;

    private String message;

}
