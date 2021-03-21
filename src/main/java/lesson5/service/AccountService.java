package lesson5.service;

import lesson5.entity.Account;
import lesson5.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private static final String SELECT_ALL_ACCOUNT_QUERY = "SELECT * FROM accounts";
    private static final String SAVE_ACCOUNT_QUERY = "INSERT INTO accounts (client_id, number, value) VALUES (?,?,?)";
    private static final String DELETE_ACCOUNT_QUERY = "DELETE FROM accounts WHERE id = ?";
    private static final String UPDATE_ACCOUNT_QUERY = "UPDATE accounts SET number = ?, value = ? WHERE id = ?";
    private static final String SELECT_NUMBER_BY_VALUE_ACCOUNT_QUERY = "SELECT * FROM accounts WHERE value > ?";

    public List<Account> getAll() {
        List<Account> accounts = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_ACCOUNT_QUERY);
            while (resultSet.next()) {
                Account account = new Account();
                account.setId(resultSet.getInt("id"));
                account.setClient_id(resultSet.getInt("client_id"));
                account.setNumber(resultSet.getString("number"));
                account.setValue(resultSet.getDouble("value"));
                accounts.add(account);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void save(Account account) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_ACCOUNT_QUERY)) {
            preparedStatement.setInt(1, account.getClient_id());
            preparedStatement.setString(2, account.getNumber());
            preparedStatement.setDouble(3, account.getValue());

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(DELETE_ACCOUNT_QUERY)) {
            preparedStatement.setInt(1, 25);

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(UPDATE_ACCOUNT_QUERY)) {
            preparedStatement.setString(1, "4545");
            preparedStatement.setDouble(2, 458.41);
            preparedStatement.setInt(3, 3);

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectNumberByValue(Double value) {
        Account account = new Account();
        List<String> numbers = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SELECT_NUMBER_BY_VALUE_ACCOUNT_QUERY)) {
            preparedStatement.setDouble(1, value);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                account.setValue(resultSet.getDouble("value"));
                if (account != null && account.getValue() > value) {
                    numbers.add(resultSet.getString("number"));
                }
            }
            System.out.println(numbers);
            preparedStatement.execute();
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
