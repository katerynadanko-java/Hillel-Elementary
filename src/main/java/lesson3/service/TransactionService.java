package lesson3.service;

import lesson3.entity.Client;
import lesson3.util.Helper;

public class TransactionService {

    public static void transferOfMoney(Client client, String accountTo){

        String accountFrom = client.getAccount();
        Helper.equalsAccount(accountFrom, accountTo);
    }
}
