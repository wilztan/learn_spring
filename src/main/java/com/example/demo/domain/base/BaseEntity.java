package com.example.demo.domain.base;

import java.util.Date;

/**
 * Base Entity Class
 *
 * Base Entity Shall be the reference of
 * all entities where it provides the
 * id, active boolean, created and updated date
 */
public class BaseEntity {

    private long id;

    private boolean isActive;

    private Date createdAt;

    private Date updatedAt;
}
