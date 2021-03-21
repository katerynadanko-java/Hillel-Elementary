package lesson5.service;

import lesson5.entity.Client;
import lesson5.entity.ClientWithStatus;
import lesson5.util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private static final String SELECT_ALL_CLIENT_QUERY = "SELECT * FROM clients";
    private static final String SAVE_CLIENT_QUERY = "INSERT INTO clients (name, email, phone, about) VALUES (?,?,?,?)";
    private static final String DELETE_CLIENT_QUERY = "DELETE FROM clients WHERE id = ?";
    private static final String UPDATE_CLIENT_QUERY = "UPDATE clients SET name = ?, email = ? WHERE id = ?";
    private static final String SELECT_CLIENT_BY_PHONE_QUERY = "SELECT * FROM clients WHERE phone = ?";
    private static final String SELECT_CLIENT_BY_ID_FROM_ACCOUNTS_QUERY = "SELECT * FROM clients AS c " +
            "INNER JOIN accounts a ON c.id = a.client_id";
    private static final String SELECT_CLIENT_NAME_EMAIL_ALIAS_QUERY = "SELECT cl.name, cl.email, s.alias FROM clients cl" +
            " INNER JOIN client_status AS cs ON cl.id = cs.client_id" +
            " INNER JOIN statuses s ON cs.status_id = s.id WHERE cl.age > 18";

    public List<Client> getAll() {
        List<Client> clients = new ArrayList<>();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_CLIENT_QUERY);
            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void save(Client client) {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SAVE_CLIENT_QUERY)) {
            preparedStatement.setString(1, client.getName());
            preparedStatement.setString(2, client.getEmail());
            preparedStatement.setLong(3, client.getPhone());
            preparedStatement.setString(4, client.getAbout());

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(DELETE_CLIENT_QUERY)) {
            preparedStatement.setInt(1, 5);

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(UPDATE_CLIENT_QUERY)) {
            preparedStatement.setString(1, "Elena777");
            preparedStatement.setString(2, "elena777@gmail.com");
            preparedStatement.setInt(3, 13);

            preparedStatement.execute();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Client getByPhone(Long phone) {
        Client client = new Client();
        try (Connection connection = Database.getConnection();
             PreparedStatement preparedStatement = connection.
                     prepareStatement(SELECT_CLIENT_BY_PHONE_QUERY)) {
            preparedStatement.setLong(1, phone);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                if (client != null && client.getPhone() == phone)
                    return client;
            }
            preparedStatement.execute();
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Client> joinClientIDAccount() {
        List<Client> clients = new ArrayList<>();
        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_CLIENT_BY_ID_FROM_ACCOUNTS_QUERY);
            while (resultSet.next()) {
                Client client = new Client();
                client.setId(resultSet.getInt("id"));
                client.setName(resultSet.getString("name"));
                client.setEmail(resultSet.getString("email"));
                client.setPhone(resultSet.getLong("phone"));
                client.setAbout(resultSet.getString("about"));
                clients.add(client);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    public void getNameEmailAliasFromJoin() {
        ClientWithStatus clientWithStatus = new ClientWithStatus();

        try (Connection connection = Database.getConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_CLIENT_NAME_EMAIL_ALIAS_QUERY);
            while (resultSet.next()) {
                clientWithStatus.setName(resultSet.getString("name"));
                clientWithStatus.setEmail(resultSet.getString("email"));
                clientWithStatus.setAlias(resultSet.getString("alias"));
                System.out.println(clientWithStatus);
            }
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

