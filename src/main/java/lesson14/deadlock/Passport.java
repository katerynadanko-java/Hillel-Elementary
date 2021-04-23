package lesson14.deadlock;

public class Passport {
    private String number;

    private Client client;

    public Passport(String number) {
        this.number = number;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public synchronized String getNumber() {
        return number;
    }

    public synchronized String getClientName() {
        return client.getName();
    }
}
