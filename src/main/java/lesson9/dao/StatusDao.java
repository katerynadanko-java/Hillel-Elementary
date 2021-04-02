package lesson9.dao;

import lesson9.model.Status;

public interface StatusDao {
    void save(Status status);

    void update(Status status);

    void delete(Status status);

    Status getById(int id);
}
