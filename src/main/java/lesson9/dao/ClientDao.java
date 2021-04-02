package lesson9.dao;

import lesson9.model.Client;

public interface ClientDao {
    void save(Client client);

    void delete(Client client);

    void update(Client client);

    Client getById(int id);

    Client getByPhone(long phone);
}
