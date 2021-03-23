package lesson5;

import lesson5.util.Database;
import lesson5.entity.Account;
import lesson5.entity.Client;
import lesson5.entity.Status;
import lesson5.service.AccountService;
import lesson5.service.ClientService;
import lesson5.service.StatusService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setAbout("good client");
        client.setPhone(380677121281L);
        client.setEmail("you7777@mail.com");
        client.setName("Kate777");

        Account account = new Account();
        account.setClient_id(32);
        account.setNumber("98736");
        account.setValue(514.45);

        Status status = new Status();
        status.setAlias("PPOF_USER");
        status.setDescription("More then normal activity");

        Database.getConnection();

        ClientService clientService = new ClientService();
        AccountService accountService = new AccountService();
        StatusService statusService = new StatusService();

//        List<Client> clients = clientService.getAll();
//        System.out.println(clients);
//        clientService.save(client);
//        clientService.delete();
//        clientService.update();
//        System.out.println(clientService.getByPhone(380981613674L));
//        System.out.println(clientService.joinClientIDAccount());
        System.out.println(clientService.getNameEmailAliasFromJoin());

//        List<Account> accounts = accountService.getAll();
//        System.out.println(accounts);
//        accountService.save(account);
//        accountService.delete();
//        accountService.update();
//        List<String> selectNumberByValue = accountService.selectNumberByValue(600.78);
//        System.out.println(selectNumberByValue);

//        List<Status> statuses = statusService.getAll();
//        System.out.println(statuses);
//        statusService.save(status);
//        statusService.update();
//        statusService.delete();
    }
}
