package lesson11.InterfaceForClass;

public interface FourthInterface {
    default void printDefault(String s) {
        System.out.println(s + " method print() Default from FourthInterface");
    }

    static void makeStatic(String s) {
        System.out.println(s + " method make() downloaded only from FourthInterface, it can't be otherwise");
    }

    void contract1(String s);

    void contract2(String s);
}
