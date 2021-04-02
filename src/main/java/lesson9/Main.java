package lesson9;

import lesson9.model.Account;
import lesson9.model.Client;
import lesson9.model.Status;
import lesson9.service.AccountService;
import lesson9.service.AccountServiceImpl;
import lesson9.service.ClientService;
import lesson9.service.ClientServiceImpl;
import lesson9.service.StatusService;
import lesson9.service.StatusServiceImpl;
import org.apache.log4j.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class);
        try {
            Client client = new Client();
            client.setId(8);
            client.setName("Kateryna");
            client.setEmail("kateryna3@mail.com");
            client.setAbout("very good client");
            client.setPhone(380677883257L);
            ClientService clientService = new ClientServiceImpl();
            try {
                clientService.save(client);
            } catch (Exception e) {
                logger.error(String.format("client {id = %d, email = %s}", client.getId(), client.getEmail()) + " already exist", e);
            }
            clientService.delete(client);
            clientService.update(client);
            clientService.getById(4);
            clientService.getByPhone(380677882257L);

            Account account = new Account();
            account.setNumber("234872");
            account.setValue(5348.43);
            AccountService accountService = new AccountServiceImpl();
            try {
                accountService.save(account);
            } catch (Exception e) {
                logger.error(String.format("account {id = %d, number = %s}", account.getId(), account.getNumber()) + " already exist", e);
            }
            accountService.delete(account);
            accountService.getById(1);
            accountService.getByNumber("234872");

            Status status = new Status();
            status.setId(3);
            status.setAlias("USER");
            status.setDescription("low level responsibility");
            StatusService statusService = new StatusServiceImpl();
            try {
                statusService.save(status);
            } catch (Exception e) {
                logger.error(String.format("status {id = %d, alias = %s}", status.getId(), status.getAlias()) + " already exist", e);
            }
            statusService.update(status);
            statusService.delete(status);
            statusService.getById(1);
        } catch (Exception e) {
            logger.error("Something WRONG in main", e);
        }
    }
}

