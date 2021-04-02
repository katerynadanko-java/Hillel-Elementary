package lesson9.service;

import lesson9.dao.AccountDao;
import lesson9.dao.AccountDaoImpl;
import lesson9.model.Account;
import org.apache.log4j.Logger;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    Logger logger = Logger.getLogger(AccountServiceImpl.class);

    @Override
    public void save(Account account) {
        logger.debug(String.format("account. save {id = %d, number = %s}", account.getId(), account.getNumber()));
        AccountDao accountDao = new AccountDaoImpl();
        if (account.getNumber().isEmpty())
            return;
        accountDao.save(account);
    }

    @Override
    public void delete(Account account) {
        logger.debug(String.format("account. delete {id = %d, number = %s}", account.getId(), account.getNumber()));
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }

    @Override
    public void update(Account account) {
        logger.debug(String.format("account. update {id = %d, number = %s}", account.getId(), account.getNumber()));
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.update(account);
    }

    @Override
    public Account getById(int id) {
        logger.debug(String.format("account. getById {id = %d}", id));
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    @Override
    public List<Account> getByNumber(String number) {
        logger.debug(String.format("account. getByNumber {number = %s}", number));
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getByNumber(number);
    }
}
