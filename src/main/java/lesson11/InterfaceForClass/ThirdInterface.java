package lesson11.InterfaceForClass;

public interface ThirdInterface {
    default void printDefault(String s) {
        System.out.println(s + " method print() Default from ThirdInterface");
    }

    static void makeStatic(String s) {
        System.out.println(s + " method make() downloaded only from ThirdInterface, it can't be otherwise");
    }

    void contract1(String s);

    void contract2(String s);
}
