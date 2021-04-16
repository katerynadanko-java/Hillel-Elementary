package lesson11.interfaceAndImplementation;

import lesson11.interfaceAndImplementation.FirstInterface;
import lesson11.interfaceAndImplementation.SecondInterface;

public class FirstInterfaceIml implements FirstInterface, SecondInterface {
    @Override
    public void contract1(String s) {
        System.out.println(s + " Hello from method contract1() no matter from which interface");
    }

    @Override
    public void contract2(String s) {
        System.out.println(s + " Hello from method contract2() no matter from which interface");
    }
}
