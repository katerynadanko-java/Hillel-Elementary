package lesson11.entity;

import lesson11.InterfaceForClass.FourthInterface;
import lesson11.InterfaceForClass.ThirdInterface;

public class SecondClass implements ThirdInterface, FourthInterface {
    @Override
    public void printDefault(String s) {
        System.out.println(s + " method print() from no matter which interface because it overrides in SecondClass");
    }

    @Override
    public void contract1(String s) {
        System.out.println(s + " Hello from method contract1 no matter from which interface");
    }

    @Override
    public void contract2(String s) {
        System.out.println(s + " Hello from method contract2 no matter from which interface");
    }
}
