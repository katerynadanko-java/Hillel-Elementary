package lesson7.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(nullable = false)
    private String surname;

    @ManyToMany(mappedBy = "teachers")
    private Set<Client> clients;

    @ManyToMany
    @JoinTable(
            name = "teacher_runk",
            joinColumns = {@JoinColumn(name = "teacher_id")},
            inverseJoinColumns = {@JoinColumn(name = "runk_id")})
    private Set<Runk> runks;

    @ManyToMany(mappedBy = "teachers")
    private Set<Subject> subjects;

}
