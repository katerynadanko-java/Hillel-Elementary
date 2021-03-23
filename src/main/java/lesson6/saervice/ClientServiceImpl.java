package lesson6.saervice;

import lesson6.dao.ClientDao;
import lesson6.dao.ClientDaoImpl;
import lesson6.model.Client;

public class ClientServiceImpl implements ClientService {

    @Override
    public void save(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        if (client.getEmail().isEmpty()){
            return;
        }
        client.setEmail(client.getEmail().toLowerCase());
        clientDao.save(client);
    }
}
