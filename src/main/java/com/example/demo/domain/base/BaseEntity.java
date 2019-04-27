package com.example.demo.domain.base;

import lombok.Getter;

import java.util.Date;

/**
 * Base Entity Class
 *
 * Base Entity Shall be the reference of
 * all entities where it provides the
 * id, active boolean, created and updated date
 */
@Getter
public class BaseEntity {

    private long id;

    private boolean isActive = true;

    private Date createdAt;

    private Date updatedAt;

}
