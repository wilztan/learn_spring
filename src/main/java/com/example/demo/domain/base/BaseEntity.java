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

    private boolean isActive = true;

    private Date createdAt;

    private Date updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
