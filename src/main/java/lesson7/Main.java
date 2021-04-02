package lesson7;

import lesson7.domain.Account;
import lesson7.domain.Book;
import lesson7.domain.Passport;
import lesson7.domain.Runk;
import lesson7.domain.Client;
import lesson7.domain.Status;
import lesson7.domain.Subject;
import lesson7.domain.Teacher;
import lesson7.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Maria");
        client.setEmail("maria@mail.com");
        client.setAbout("good student");
        client.setPhone(380687572173L);
        Set<Client> clients = new HashSet<>();
        clients.add(client);

        Book book = new Book();
        book.setSubject("Math");
        book.setAuthor("Tom Smith");
        book.setClient(client);

        Passport passport = new Passport();
        passport.setClient(client);
        passport.setNumber("1237");

        Subject subject = new Subject();
        subject.setName("Math");
        subject.setClients(clients);
        subject.setDescription("technical subject");
        Set<Subject> subjects = new HashSet<>();
        subjects.add(subject);
        subject.setClients(clients);

        Teacher teacher = new Teacher();
        teacher.setName("Kateryna");
        teacher.setSurname("Danko");
        teacher.setClients(clients);
        Set<Teacher> teachers = new HashSet<>();
        teachers.add(teacher);
        teacher.setClients(clients);
        teacher.setSubjects(subjects);

        Runk runk = new Runk();
        runk.setAlias("PhD");
        runk.setTeachers(teachers);

        Account account = new Account();
        account.setNumber("234345346");

        Status status = new Status();
        status.setAlias("USER");
        status.setDescription("Beginner");


        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(client);
        session.save(book);
        session.save(passport);
        session.save(subject);

        transaction.commit();
        session.close();
    }
}
