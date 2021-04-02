package lesson6.dao;

import lesson6.model.Status;

public interface StatusDao {
    void save(Status status);

    void update(Status status);

    void delete(Status status);

    Status getById(int id);
}
