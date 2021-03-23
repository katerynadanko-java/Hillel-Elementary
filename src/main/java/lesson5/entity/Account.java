package lesson5.entity;

import lombok.Data;

@Data
public class Account {
    private int id;
    private int client_id;
    private String number;
    private double value;
}
