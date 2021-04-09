package lesson11;

import lesson11.InterfaceForClass.FirstInterface;
import lesson11.InterfaceForClass.FourthInterface;
import lesson11.InterfaceForClass.SecondInterface;
import lesson11.InterfaceForClass.ThirdInterface;
import lesson11.entity.FirstClass;
import lesson11.entity.SecondClass;
import lesson11.util.Helper;

import java.io.IOException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws Throwable {
        String s1 = "This is class FirstClass and";
        String s2 = "This is class SecondClass and";
        String s3 = "This is Static";
        String s4 = "The same that in FirstClass and";
        String s5 = "The same that in SecondClass and";

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();
        FirstInterface firstClassFromFirstInterface = new FirstClass();
        SecondInterface firstClassFromSecondInterface = new FirstClass();
        ThirdInterface secondClassFromThirdInterface = new SecondClass();
        FourthInterface secondClassFromFourthInterface = new SecondClass();

        System.out.println("Interfaces with static methods: ");
        FirstInterface.makeStatic(s3);
        SecondInterface.makeStatic(s3);
        ThirdInterface.makeStatic(s3);
        FourthInterface.makeStatic(s3);

        System.out.println("FirstClass firstClass: ");
        firstClass.contract1(s1);
        firstClass.contract2(s1);
        firstClass.printDefault(s1);

        System.out.println("SecondClass secondClass: ");
        secondClass.contract1(s2);
        secondClass.contract2(s2);
        secondClass.printDefault(s2);

        System.out.println("firstClassFromFirstInterface: ");
        firstClassFromFirstInterface.contract1(s4);
        firstClassFromFirstInterface.contract2(s4);
        firstClassFromFirstInterface.printDefault(s4);

        System.out.println("firstClassFromSecondInterface: ");
        firstClassFromSecondInterface.contract1(s4);
        firstClassFromSecondInterface.contract2(s4);
        firstClassFromSecondInterface.printDefault(s4);

        System.out.println("secondClassFromThirdInterface: ");
        secondClassFromThirdInterface.contract1(s5);
        secondClassFromThirdInterface.contract2(s5);
        secondClassFromThirdInterface.printDefault(s5);

        System.out.println("secondClassFromFourthInterface: ");
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
