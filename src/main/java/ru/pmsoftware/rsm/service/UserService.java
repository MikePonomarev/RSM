package ru.pmsoftware.rsm.service;


import ru.pmsoftware.rsm.model.User;
import ru.pmsoftware.rsm.util.exception.NotFoundException;

import java.util.List;

/**
 * MPonomarev
 * 01.02.2017
 */
public interface UserService {

    User save(User user);

    void delete(int id) throws NotFoundException;

    User get(int id) throws NotFoundException;

    User getByEmail(String email) throws NotFoundException;

    List<User> getAll();

    void update(User user);
}
