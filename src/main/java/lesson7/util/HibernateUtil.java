package lesson7.util;

import lesson7.domain.Book;
import lesson7.domain.RecordBook;
import lesson7.domain.Runk;
import lesson7.domain.Student;
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

                configuration.addAnnotatedClass(Student.class);
                configuration.addAnnotatedClass(Book.class);
                configuration.addAnnotatedClass(Subject.class);
                configuration.addAnnotatedClass(RecordBook.class);
                configuration.addAnnotatedClass(Teacher.class);
                configuration.addAnnotatedClass(Runk.class);

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
