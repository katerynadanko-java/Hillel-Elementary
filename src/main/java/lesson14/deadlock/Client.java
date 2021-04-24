package lesson14.deadlock;

public class Client {
    private String name;

    private Passport passport;

    public Client(String name) {
        this.name = name;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized String getPassportNumber() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return passport.getNumber();
    }
}
