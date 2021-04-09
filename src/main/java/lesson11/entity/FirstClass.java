package lesson11.entity;

import lesson11.InterfaceForClass.FirstInterface;
import lesson11.InterfaceForClass.SecondInterface;

public class FirstClass implements FirstInterface, SecondInterface {
    @Override
    public void contract1(String s) {
        System.out.println(s + " Hello from method contract1() no matter from which interface");
    }

    @Override
    public void contract2(String s) {
        System.out.println(s + " Hello from method contract2() no matter from which interface");
    }
}
