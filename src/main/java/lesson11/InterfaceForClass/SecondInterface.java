package lesson11.InterfaceForClass;

public interface SecondInterface extends FirstInterface {
    default void printDefault(String s) {
        System.out.println(s + " method print() from SecondInterface because SecondInterface extends FirstInterface and it has priority over the FirstInterface");
    }

    static void makeStatic(String s) {
        System.out.println(s + " method make() downloaded only from SecondInterface, it can't be otherwise");
    }

    void contract1(String s);

    void contract2(String s);
}
