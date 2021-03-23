package lesson6;

import lesson6.model.Client;
import lesson6.saervice.ClientService;
import lesson6.saervice.ClientServiceImpl;

public class Main {
    public static void main(String[] args) {
        ClientService clientService = new ClientServiceImpl();
        Client client = new Client();
        client.setId(25);
        client.setName("Boris");
        client.setPhone(380509483792L);
        client.setEmail("boris@gmail.com");
        client.setAbout("adult client");

        clientService.save(client);
    }
}


//2.1. Сохранения;
//
//        2.2. Обновления;
//
//        2.3. Получения по id;
//
//        2.4. Удаления;
//
//        3. Создать сущности для этих сервисов, опираясь на поля таблиц из ДЗ_11 и добавить маппинг используя аннотации Hibernate;
//
//        4. Добавить метод для поиска Client по номеру телефона в соответствующий сервис;