package lesson6.service;

import lesson6.dao.AccountDao;
import lesson6.dao.AccountDaoImpl;
import lesson6.model.Account;

import java.util.List;

public class AccountSrrviceImpl implements AccountService {
    @Override
    public void save(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        if(account.getNumber().isEmpty())
            return;
        accountDao.save(account);
    }

    @Override
    public void delete(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }

    @Override
    public Account update(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.update(account);
        return null;
    }

    @Override
    public Account getById(int id) {
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    @Override
    public List<Account> getByNumber(String number){
    AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getByNumber(number);
    }
}
