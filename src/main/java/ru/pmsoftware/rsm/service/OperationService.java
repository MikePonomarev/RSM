package ru.pmsoftware.rsm.service;

import ru.pmsoftware.rsm.model.Operation;
import ru.pmsoftware.rsm.util.exception.NotFoundException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;

/**
 * MPonomarev
 * 01.02.2017
 */
public interface OperationService {
    Operation get(int id, int userId) throws NotFoundException;

    void delete(int id, int userId) throws NotFoundException;

    default Collection<Operation> getBetweenDates(LocalDate startDate, LocalDate endDate, int userId) {
        return getBetweenDateTimes(LocalDateTime.of(startDate, LocalTime.MIN), LocalDateTime.of(endDate, LocalTime.MAX), userId);
    }

    Collection<Operation> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, int userId);

    Collection<Operation> getAll(int userId);

    Operation update(Operation meal, int userId) throws NotFoundException;

    Operation save(Operation meal, int userId);
}
