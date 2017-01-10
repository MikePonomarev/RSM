package ru.pmsoftware.rsm.model;

/**
 * Created by Mike on 26.11.2016.
 */
public class Contragent {
    private final String name;

    private final String passportData;

    private int mobileNumber;

    public Contragent(String name, String passportData, int mobileNumber) {
        this.name = name;
        this.passportData = passportData;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassportData() {
        return passportData;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }
}
