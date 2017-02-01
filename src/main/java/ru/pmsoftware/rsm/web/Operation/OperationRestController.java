package ru.pmsoftware.rsm.web.Operation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.pmsoftware.rsm.AuthorizedUser;
import ru.pmsoftware.rsm.model.Operation;
import ru.pmsoftware.rsm.service.OperationService;
import ru.pmsoftware.rsm.util.TimeUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * MPonomarev
 * 01.02.2017
 */
@Controller
public class OperationRestController {
    private static final Logger LOG = LoggerFactory.getLogger(OperationRestController.class);

    @Autowired
    private OperationService service;

    public Operation get(int id) {
        int userId = AuthorizedUser.id();
        LOG.info("get operation {} for User {}", id, userId);
        return service.get(id, userId);
    }

    public void delete(int id) {
        int userId = AuthorizedUser.id();
        LOG.info("delete operation {} for User {}", id, userId);
        service.delete(id, userId);
    }

    public List<Operation> getAll() {
        int userId = AuthorizedUser.id();
        LOG.info("getAll for User {}", userId);
        return (List<Operation>) service.getAll(userId);
    }

    public void update(Operation operation, int id) {
        operation.setId(id);
        int userId = AuthorizedUser.id();
        LOG.info("update {} for User {}", operation, userId);
        service.update(operation, userId);
    }

    public Operation create(Operation operation) {
        operation.setId(null);
        int userId = AuthorizedUser.id();
        LOG.info("create {} for User {}", operation, userId);
        return service.save(operation, userId);
    }

    public List<Operation> getBetween(LocalDate startDate, LocalTime startTime, LocalDate endDate, LocalTime endTime) {
        int userId = AuthorizedUser.id();
        LOG.info("getBetween dates {} - {} for time {} - {} for User {}", startDate, endDate, startTime, endTime, userId);

        return (List<Operation>) service.getBetweenDates(startDate != null ? startDate : TimeUtil.MIN_DATE, endDate != null ? endDate : TimeUtil.MAX_DATE, userId);
    }
}
