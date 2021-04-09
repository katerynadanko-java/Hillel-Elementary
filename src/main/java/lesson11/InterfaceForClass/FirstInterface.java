package lesson11.InterfaceForClass;

public interface FirstInterface {
    default void printDefault(String s) {
        System.out.println(s + " method print() Default from FirstInterface, but this message von`t be printed");
    }

    static void makeStatic(String s) {
        System.out.println(s + " method make() downloaded only from FirstInterface, it can't be otherwise");
    }

    void contract1(String s);

    void contract2(String s);
}
