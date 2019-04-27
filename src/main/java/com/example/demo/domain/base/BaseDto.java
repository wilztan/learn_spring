package com.example.demo.domain.base;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class BaseDto {

    private final Object data;

    private final boolean success;

    private final int status;

    public BaseDto(){
        this(null,false,0);
    }

}
