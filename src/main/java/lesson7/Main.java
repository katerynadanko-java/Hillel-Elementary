package lesson7;

import lesson7.domain.Book;
import lesson7.domain.RecordBook;
import lesson7.domain.Runk;
import lesson7.domain.Student;
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
        Student student = new Student();
        student.setName("Maria");
        student.setEmail("maria@mail.com");
        student.setAbout("good student");
        student.setPhone(380687572173L);
        Set<Student> students = new HashSet<>();
        students.add(student);

        Book book = new Book();
        book.setSubject("Math");
        book.setAuthor("Tom Smith");
        book.setStudent(student);

        RecordBook recordBook = new RecordBook();
        recordBook.setStudent(student);
        recordBook.setNumber("1237");

        Subject subject = new Subject();
        subject.setName("Math");
        subject.setStudents(students);
        subject.setDescription("technical subject");
        Set<Subject> subjects = new HashSet<>();
        subjects.add(subject);
        subject.setStudents(students);

        Teacher teacher = new Teacher();
        teacher.setName("Kateryna");
        teacher.setSurname("Danko");
        teacher.setStudents(students);
        Set<Teacher> teachers = new HashSet<>();
        teachers.add(teacher);
        teacher.setStudents(students);
        teacher.setSubjects(subjects);

        Runk runk = new Runk();
        runk.setAlias("PhD");
        runk.setTeachers(teachers);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        session.save(book);
        session.save(recordBook);
        session.save(subject);

        transaction.commit();
        session.close();
    }
}
