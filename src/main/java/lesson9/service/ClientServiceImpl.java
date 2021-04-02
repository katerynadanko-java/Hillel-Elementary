package lesson9.service;

import lesson9.dao.ClientDao;
import lesson9.dao.ClientDaoImpl;
import lesson9.model.Client;
import org.apache.log4j.Logger;


public class ClientServiceImpl implements ClientService {

    Logger logger = Logger.getLogger(ClientServiceImpl.class);

    @Override
    public void save(Client client) {
        logger.debug(String.format("client. save {id = %d, email = %s, phone = %d}",
                client.getId(), client.getEmail(), client.getPhone()));
        ClientDao clientDao = new ClientDaoImpl();
        if (client.getEmail().isEmpty()) {
            return;
        }
        client.setEmail(client.getEmail().toLowerCase());
        clientDao.save(client);
    }

    @Override
    public void delete(Client client) {
        logger.debug(String.format("client. delete {id = %d, email = %s}", client.getId(), client.getEmail()));
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }

    @Override
    public void update(Client client) {
        logger.debug(String.format("client. update {id = %d, email = %s}", client.getId(), client.getEmail()));
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);

    }

    @Override
    public Client getById(int id) {
        logger.debug(String.format("client. getById {id = %d}", id));
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }

    @Override
    public Client getByPhone(long phone) {
        logger.debug(String.format("client. getByPhone {phone = %d}", phone));
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getByPhone(phone);
    }
}
