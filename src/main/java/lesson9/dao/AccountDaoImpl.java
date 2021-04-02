package lesson9.dao;

import lesson9.model.Account;
import lesson9.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    Logger logger = Logger.getLogger(AccountDaoImpl.class);

    @Override
    public void save(Account account) {
        logger.debug(String.format("client. save {id = %d, email = %s}",
                account.getId(), account.getNumber()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        logger.debug(String.format("client. update {id = %d, email = %s}",
                account.getId(), account.getNumber()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(account);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Account account) {
        logger.debug(String.format("client. delete {id = %d, email = %s}",
                account.getId(), account.getNumber()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(account);
        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(int id) {
        logger.debug(String.format("client. getById {id = %d, email = %s}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.byId(Account.class).getReference(id);
    }

    @Override
    public List<Account> getByNumber(String number) {
        logger.debug(String.format("client. getByNumber {id = %d, email = %s}", number));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return (List<Account>) session.createQuery("From lesson9.model.Account WHERE number = :number")
                .setParameter("number", number).uniqueResult();
    }
}
