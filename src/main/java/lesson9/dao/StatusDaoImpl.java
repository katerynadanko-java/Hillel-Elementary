package lesson9.dao;

import lesson9.model.Status;
import lesson9.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDaoImpl implements StatusDao {
    Logger logger = Logger.getLogger(StatusDaoImpl.class);

    @Override
    public void save(Status status) {
        logger.debug(String.format("status. save {id = %d, alias = %s}", status.getId(), status.getAlias()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        logger.debug(String.format("status. update {id = %d, alias = %s}", status.getId(), status.getAlias()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Status status) {
        logger.debug(String.format("status. delete {id = %d, alias = %s}", status.getId(), status.getAlias()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(status);
        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(int id) {
        logger.debug(String.format("status. getById {id = %d}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.byId(Status.class).getReference(id);
    }
}
