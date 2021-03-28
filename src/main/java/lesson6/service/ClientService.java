package lesson6.service;

import lesson6.model.Client;

import java.util.List;

public interface ClientService {
    void save(Client client);
    void delete(Client client);
    void update(Client client);
    Client getById(int id);
    List<Client> getByPhone(long phone);
}
