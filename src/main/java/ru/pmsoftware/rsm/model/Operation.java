package ru.pmsoftware.rsm.model;

import java.time.LocalDateTime;

/**
 * MPonomarev
 * 26.11.2016
 */
public class Operation extends BaseEntity {
    private final LocalDateTime dateTime;

    private final int value;

    private final User user;

    private final Location location;

    private final String description;

    public Operation(LocalDateTime dateTime, int value, User user, Location location, String description) {
        this(null, dateTime, value, user, location, description);
    }

    public Operation(Integer id, LocalDateTime dateTime, int value, User user, Location location, String description) {
        super(id);
        this.dateTime = dateTime;
        this.value = value;
        this.user = user;
        this.location = location;
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getValue() {
        return value;
    }

    public User getUser() {
        return user;
    }

    public Location getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
