package lesson5.entity;

import lombok.Data;

@Data
public class Account {
    int id;
    int client_id;
    String number;
    double value;
}
