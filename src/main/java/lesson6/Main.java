package lesson6;

import lesson6.model.Account;
import lesson6.model.Client;
import lesson6.service.AccountService;
import lesson6.service.AccountSrrviceImpl;
import lesson6.service.ClientServiceImpl;
import lesson6.service.ClientService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Account account = new Account();
//        account.setId(1);
//        account.setClientId(2);
//        account.setNumber("109");
//        account.setValue(779);
//
//        AccountService accountService = new AccountSrrviceImpl();
//        accountService.save(account);
//        accountService.update(account);
//        accountService.delete(account);
//        Account getById = accountService.getById(account.getId());
//        System.out.println(getById);
//        List<Account> accountsGetByPhone = accountService.getByNumber(account.getNumber());
//        System.out.println(accountsGetByPhone);
//
        Client client = new Client();
        client.setId(26);
        client.setName("Maria777");
        client.setEmail("maria777@mail.com");
        client.setAbout("good client");
        client.setPhone(380687572173L);
        ClientService clientService = new ClientServiceImpl();
//        Client clientsGetByPhone = clientService.getByPhone(380687553173L);
//        System.out.println(clientsGetByPhone);
//        clientService.delete(client);
//        Client getClientById = clientService.getById(7);
//        System.out.println(getClientById);
//        clientService.save(client);
        clientService.update(client);
//
//        StatusService statusService = new StatusServiceImpl();
//        Status status = new Status();
//        status.setId(13);
//        status.setAlias("ADMIN777");
//        status.setDescription("height activity");
//        statusService.save(status);
//        statusService.delete(status);
//        statusService.update(status);
//        Status statusById = statusService.getById(13);
//        System.out.println(statusById);
    }
}
