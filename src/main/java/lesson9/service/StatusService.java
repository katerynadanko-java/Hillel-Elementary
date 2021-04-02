package lesson9.service;

import lesson9.model.Status;

public interface StatusService {
    void save(lesson9.model.Status status);

    void update(lesson9.model.Status status);

    void delete(lesson9.model.Status status);

    Status getById(int id);
}
