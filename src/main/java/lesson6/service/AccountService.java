package lesson6.service;

import lesson6.model.Account;

import java.util.List;

public interface AccountService {
    void save(Account account);
    void delete(Account account);
    void update(Account account);
    Account getById(int id);
    List<Account> getByNumber(String number);
}
