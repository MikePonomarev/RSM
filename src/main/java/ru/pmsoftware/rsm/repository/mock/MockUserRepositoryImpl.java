package ru.pmsoftware.rsm.repository.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ru.pmsoftware.rsm.model.User;
import ru.pmsoftware.rsm.repository.UserRepository;

import java.util.List;

@Repository
public class MockUserRepositoryImpl implements UserRepository {
    private static final Logger LOG = LoggerFactory.getLogger(MockUserRepositoryImpl.class);

    @Override
    public User save(User user) {
        LOG.info("save " + user);
        return null;
    }

    @Override
    public boolean delete(int id) {
        LOG.info("delete " + id);
        return false;
    }

    @Override
    public User get(int id) {
        LOG.info("get " + id);
        return null;
    }

    @Override
    public User getByEmail(String email) {
        LOG.info("getByEmail " + email);
        return null;
    }

    @Override
    public List<User> getAll() {
        LOG.info("getAll");
        return null;
    }
}
