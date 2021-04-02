package lesson6.service;

import lesson6.model.Status;

public interface StatusService {
    void save(Status status);

    void update(Status status);

    void delete(Status status);

    Status getById(int id);
}
