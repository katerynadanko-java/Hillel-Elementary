package lesson12;

import lesson12.funktionalInterfaceHomeWork.ConsumerHomeWork;
import lesson12.funktionalInterfaceHomeWork.FunctionHomeWork;
import lesson12.funktionalInterfaceHomeWork.PredicateHomeWork;
import lesson12.funktionalInterfaceHomeWork.SupplierHomeWork;
import lesson7.domain.Client;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PredicateHomeWork<Double> predicateHomeWork = doubleSalary -> doubleSalary > 1500.0;
        System.out.println("predicateHomeWork.salary: " + predicateHomeWork.salary(160000.0));
        System.out.println("predicateHomeWork.salary: " + predicateHomeWork.salary(1400.5));
        System.out.println("predicateHomeWork.salary: " + predicateHomeWork.salary(-9.0));

        ConsumerHomeWork<String> consumerHomeWork = string -> {
            if ((string == null || string.isEmpty())) {
                System.out.println("string is empty");
            } else {
                System.out.print(Arrays.toString(string.toCharArray()));
            }
        };
        System.out.print("consumerHomeWork.stringToCharArray: ");
        consumerHomeWork.stringToCharArray("Kateryna");
        System.out.println();

        FunctionHomeWork<String, Integer> functionHomeWork = integer -> checkInteger(integer);

                System.out.println("functionHomeWork.numberToString(3): " + functionHomeWork.numberToString(3));
        System.out.println("functionHomeWork.numberToString(20): " + functionHomeWork.numberToString(20));

        Client client = new Client();
        client.setEmail("kate@gmail.com");
        SupplierHomeWork<String> supplierHomeWork = () -> {
            if ((client.getEmail() == null) || (client.getEmail().isEmpty()) || !client.getEmail().contains("@"))
                return "Email is empty or not valid!";
            else
                return client.getEmail();
        };
        System.out.println("supplierHomeWork.getData(): " + supplierHomeWork.getData());
    }
    static String checkInteger(int integer) {
        switch (integer) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return "unknown";
        }
    }
}
