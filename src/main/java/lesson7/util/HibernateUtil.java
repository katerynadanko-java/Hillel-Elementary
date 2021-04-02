package lesson7.util;

import lesson7.domain.Account;
import lesson7.domain.Book;
import lesson7.domain.Passport;
import lesson7.domain.Passport;
import lesson7.domain.Runk;
import lesson7.domain.Client;
import lesson7.domain.Status;
import lesson7.domain.Subject;
import lesson7.domain.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {

                Configuration configuration = new Configuration().configure();

                configuration.addAnnotatedClass(Client.class);
                configuration.addAnnotatedClass(Book.class);
                configuration.addAnnotatedClass(Subject.class);
                configuration.addAnnotatedClass(Passport.class);
                configuration.addAnnotatedClass(Teacher.class);
                configuration.addAnnotatedClass(Runk.class);
                configuration.addAnnotatedClass(Status.class);
                configuration.addAnnotatedClass(Account.class);

                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            } catch (Exception e) {
                System.out.println("Session factory Error: " + e);
            }
        }
        return sessionFactory;
    }

}
