package ru.pmsoftware.rsm.repository;

import ru.pmsoftware.rsm.model.Operation;

import java.time.LocalDateTime;
import java.util.Collection;

/**
 * MPonomarev
 * 14.01.2016
 */
public interface OperationRepository {
    // null if updated meal do not belong to userId
    Operation save(Operation meal, int userId);

    // false if meal do not belong to userId
    boolean delete(int id, int userId);

    // null if meal do not belong to userId
    Operation get(int id, int userId);

    // ORDERED dateTime
    Collection<Operation> getAll(int userId);

    // ORDERED dateTime
    Collection<Operation> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId);
}
