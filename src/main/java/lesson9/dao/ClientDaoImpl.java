package lesson9.dao;

import lesson9.model.Client;
import lesson9.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDaoImpl implements ClientDao {

    Logger logger = Logger.getLogger(ClientDaoImpl.class);

    @Override
    public void save(Client client) {
        logger.debug(String.format("client. save {id = %d, email = %s, phone = %d}",
                client.getId(), client.getEmail(), client.getPhone()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Client client) {
        logger.debug(String.format("client. delete {id = %d, email = %s, phone = %d}",
                client.getId(), client.getEmail(), client.getPhone()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(client);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        logger.debug(String.format("client. update {id = %d, email = %s, phone = %d}",
                client.getId(), client.getEmail(), client.getPhone()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(client);
        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(int id) {
        logger.debug(String.format("client. getById {id = %d,}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.byId(Client.class).getReference(id);
    }

    @Override
    public Client getByPhone(long phone) {
        logger.debug(String.format("client. getByPhone {phone = %d}", phone));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return (Client) session.createQuery("FROM lesson9.model.Client WHERE phone = :phone")
                .setParameter("phone", phone).uniqueResult();
    }
}
