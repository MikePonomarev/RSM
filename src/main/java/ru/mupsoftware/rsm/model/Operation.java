package ru.mupsoftware.rsm.model;

import java.time.LocalDateTime;

/**
 * MPonomarev
 * 26.11.2016
 */
public class Operation {
    private final LocalDateTime dateTime;

    private final int value;

    private final Contragent contragent;

    private final Location location;

    private final OperationType operationType;

    private final String description;

    public Operation(LocalDateTime dateTime, int value, Contragent contragent, Location location,
                     OperationType operationType, String description) {
        this.dateTime = dateTime;
        this.value = value;
        this.contragent = contragent;
        this.location = location;
        this.operationType = operationType;
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getValue() {
        return value;
    }

    public Contragent getContragent() {
        return contragent;
    }

    public Location getLocation() {
        return location;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public String getDescription() {
        return description;
    }
}
