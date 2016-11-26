package ru.mupsoftware.rsm.model;

import java.time.LocalDateTime;

/**
 * MPonomarev
 * 26.11.2016
 */
public class Location {
    private final String name;

    private final LocalDateTime dateTime;

    private final int budget;

    public Location(String name, LocalDateTime dateTime, int budget) {
        this.name = name;
        this.dateTime = dateTime;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getBudget() {
        return budget;
    }
}
