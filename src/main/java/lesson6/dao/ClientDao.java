package lesson6.dao;

import lesson6.model.Client;

import java.util.List;

public interface ClientDao {
    void save(Client client);

    void delete(Client client);

    void update(Client client);

    Client getById(int id);

    List<Client> getByPhone(long phone);
}
