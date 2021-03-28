package lesson6.dao;

import lesson6.model.Account;

import java.util.List;

public interface AccountDao {
    void save(Account account);

    void update(Account account);

    void delete(Account account);

    Account getById(int id);

    List<Account> getByNumber(String number);
}
