package ru.mupsoftware.rsm.util;

import java.time.LocalTime;

/**
 * MPonomarev
 * 26.11.2016
 */
public class TimeUtil {
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}
