package lesson9.service;

import lesson9.model.Client;

public interface ClientService {
    void save(Client client);

    void delete(Client client);

    void update(Client client);

    Client getById(int id);

    Client getByPhone(long phone);
}
