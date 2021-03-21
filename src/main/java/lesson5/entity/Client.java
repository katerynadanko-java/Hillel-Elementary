package lesson5.entity;

import lombok.Data;

@Data
public class Client {
    int id;
    String name;
    String email;
    long phone;
    String about;
    int age;

}
