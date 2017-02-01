package ru.pmsoftware.rsm.model;

import java.time.LocalDateTime;

/**
 * MPonomarev
 * 26.11.2016
 */
public class Location extends NamedEntity {
    private LocalDateTime dateTime;

    private int budget;

    public Location(Integer id, String name, LocalDateTime dateTime, int budget) {
        super(id, name);
        this.dateTime = dateTime;
        this.budget = budget;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public int getBudget() {
        return budget;
    }
}
