package lesson6.service;

import lesson6.dao.ClientDao;
import lesson6.dao.ClientDaoImpl;
import lesson6.model.Client;

import java.util.List;

public class ClientServiceImpl implements ClientService {
    @Override
    public void save(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        if (client.getEmail().isEmpty()) {
            return;
        }
        client.setEmail(client.getEmail().toLowerCase());
        clientDao.save(client);
    }

    @Override
    public void delete(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }

    @Override
    public void update(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);

    }

    @Override
    public Client getById(int id) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }

    @Override
    public Client getByPhone(long phone) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getByPhone(phone);
    }
}
