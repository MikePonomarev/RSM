package ru.pmsoftware.rsm.repository;

import ru.pmsoftware.rsm.model.Location;
import ru.pmsoftware.rsm.model.Operation;
import ru.pmsoftware.rsm.model.User;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * MPonomarev
 * 14.01.2017
 */
public class InMemoryOperationRepository implements OperationRepository {
    private Map<Integer, Operation> repository = new ConcurrentHashMap<>();

    private AtomicInteger counter = new AtomicInteger(0);

    private User mike = new User(5, "Mike", "", 0);
    private User pavel = new User(1, "Pavel", "", 123);
    private User alexey = new User(2, "Alexey", "", 123);
    private Location ozd = new Location(3, "OZD", LocalDateTime.of(2016, Month.APRIL, 10, 10, 0), 1000000);

    {
        save(new Operation(LocalDateTime.of(2016, Month.APRIL, 10, 10, 0), -100, alexey, ozd, "аванс"), mike.getId());
        save(new Operation(LocalDateTime.of(2016, Month.MARCH, 10, 10, 0), 100, pavel, ozd, "аванс"), mike.getId());
        save(new Operation(LocalDateTime.of(2016, Month.MAY, 10, 10, 0), 100, alexey, ozd, "аванс"), mike.getId());
        save(new Operation(LocalDateTime.of(2016, Month.SEPTEMBER, 10, 10, 0), 100, pavel, ozd, "аванс"), mike.getId());
        save(new Operation(LocalDateTime.of(2016, Month.NOVEMBER, 10, 10, 0), 100, alexey, ozd, "аванс"), mike.getId());
        save(new Operation(LocalDateTime.of(2016, Month.APRIL, 10, 10, 0), 100, pavel, ozd, "аванс"), mike.getId());
        save(new Operation(LocalDateTime.of(2016, Month.APRIL, 10, 10, 0), 100, alexey, ozd, "аванс"), mike.getId());
    }

    @Override
    public Operation save(Operation operation, int userId) {
        if (operation.isNew()) {
            operation.setId(counter.incrementAndGet());
        }
        return repository.put(operation.getId(), operation);
    }

    @Override
    public boolean delete(int id, int userId) {
        repository.remove(id);
        return true;
    }

    @Override
    public Operation get(int id, int userId) {
        return repository.get(id);
    }

    @Override
    public Collection<Operation> getAll(int userId) {
        return repository.values();
    }

    @Override
    public Collection<Operation> getBetween(LocalDateTime startDate, LocalDateTime endDate, int userId) {
        return repository.values();
    }
}
