package ru.pmsoftware.rsm.repository;

import ru.pmsoftware.rsm.model.User;

import java.util.List;

/**
 * MPonomarev
 * 14.01.2016
 */
public interface UserRepository {
    User save(User user);

    // false if not found
    boolean delete(int id);

    // null if not found
    User get(int id);

    // null if not found
    User getByEmail(String email);

    List<User> getAll();
}
