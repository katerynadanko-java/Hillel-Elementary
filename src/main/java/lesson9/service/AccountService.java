package lesson9.service;

import lesson9.model.Account;

import java.util.List;

public interface AccountService {
    void save(lesson9.model.Account account);

    void delete(lesson9.model.Account account);

    void update(lesson9.model.Account account);

    Account getById(int id);

    List<Account> getByNumber(String number);
}
