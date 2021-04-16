package lesson11;

import lesson11.interfaceAndImplementation.FirstInterface;
import lesson11.interfaceAndImplementation.FourthInterface;
import lesson11.interfaceAndImplementation.SecondInterface;
import lesson11.interfaceAndImplementation.ThirdInterface;
import lesson11.interfaceAndImplementation.FirstInterfaceIml;
import lesson11.interfaceAndImplementation.SecondInterfaceIml;
import lesson11.util.Helper;

import java.io.IOException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws Throwable {
        String s1 = "This is class FirstInterfaceIml and";
        String s2 = "This is class SecondInterfaceIml and";
        String s3 = "This is Static";
        String s4 = "The same that in FirstInterfaceIml and";
        String s5 = "The same that in SecondInterfaceIml and";

        FirstInterfaceIml firstInterfaceIml = new FirstInterfaceIml();
        SecondInterfaceIml secondInterfaceIml = new SecondInterfaceIml();
        FirstInterface firstClassFromFirstInterface = new FirstInterfaceIml();
        SecondInterface firstClassFromSecondInterface = new FirstInterfaceIml();
        ThirdInterface secondClassFromThirdInterface = new SecondInterfaceIml();
        FourthInterface secondClassFromFourthInterface = new SecondInterfaceIml();

        System.out.println("Interfaces with static methods: ");
        FirstInterface.makeStatic(s3);
        SecondInterface.makeStatic(s3);
        ThirdInterface.makeStatic(s3);
        FourthInterface.makeStatic(s3);

        System.out.println("FirstInterfaceIml firstInterfaceIml: ");
        firstInterfaceIml.contract1(s1);
        firstInterfaceIml.contract2(s1);
        firstInterfaceIml.printDefault(s1);

        System.out.println("SecondInterfaceIml secondInterfaceIml: ");
        secondInterfaceIml.contract1(s2);
        secondInterfaceIml.contract2(s2);
        secondInterfaceIml.printDefault(s2);

        System.out.println("firstInterfaceImlFromFirstInterface: ");
        firstClassFromFirstInterface.contract1(s4);
        firstClassFromFirstInterface.contract2(s4);
        firstClassFromFirstInterface.printDefault(s4);

        System.out.println("firstInterfaceImlFromSecondInterface: ");
        firstClassFromSecondInterface.contract1(s4);
        firstClassFromSecondInterface.contract2(s4);
        firstClassFromSecondInterface.printDefault(s4);

        System.out.println("secondInterfaceImlFromThirdInterface: ");
        secondClassFromThirdInterface.contract1(s5);
        secondClassFromThirdInterface.contract2(s5);
        secondClassFromThirdInterface.printDefault(s5);

        System.out.println("secondInterfaceImlFromFourthInterface: ");
        secondClassFromFourthInterface.contract1(s5);
        secondClassFromFourthInterface.contract2(s5);
        secondClassFromFourthInterface.printDefault(s5);

        System.out.println();
        System.out.print("Optional with right email: ");
        Optional optionalRightEmail = Helper.checkEmail("kate@gmail.com");
        System.out.println(optionalRightEmail);

        System.out.print("Optional with wrong email: ");
        Optional optionalWrongEmail = Helper.checkEmail("kate_com");
        System.out.println(optionalWrongEmail);

        System.out.print("Optional with null: ");
        Optional optionalNullEmail = Helper.checkEmail(null);
        System.out.println(optionalNullEmail);

        System.out.print("Optional with empty email ");
        Optional optionalEmptyEmail = Helper.checkEmail("");
        System.out.println("before orElseThrow: " + optionalEmptyEmail);
        System.out.println("Call orElseThrow(IOException::new): ");
        optionalEmptyEmail.orElseThrow(IOException::new);
        System.out.print("This message will never print!");
    }
}
