package ru.pmsoftware.rsm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.pmsoftware.rsm.model.Operation;
import ru.pmsoftware.rsm.repository.OperationRepository;
import ru.pmsoftware.rsm.util.exception.ExceptionUtil;

import java.time.LocalDateTime;
import java.util.Collection;

@Service
public class OperationServiceImpl implements OperationService {

    @Autowired
    private OperationRepository repository;

    @Override
    public Operation get(int id, int userId) {
        return ExceptionUtil.checkNotFoundWithId(repository.get(id, userId), id);
    }

    @Override
    public void delete(int id, int userId) {
        ExceptionUtil.checkNotFoundWithId(repository.delete(id, userId), id);
    }

    @Override
    public Collection<Operation> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, int userId) {
        return repository.getBetween(startDateTime, endDateTime, userId);
    }

    @Override
    public Collection<Operation> getAll(int userId) {
        return repository.getAll(userId);
    }

    @Override
    public Operation update(Operation meal, int userId) {
        return ExceptionUtil.checkNotFoundWithId(repository.save(meal, userId), meal.getId());
    }

    @Override
    public Operation save(Operation meal, int userId) {
        return repository.save(meal, userId);
    }
}
