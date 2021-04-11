package lesson12;

import lesson12.funktionalInterfaceHomeWork.ConsumerHomeWork;
import lesson12.funktionalInterfaceHomeWork.FunctionHomeWork;
import lesson12.funktionalInterfaceHomeWork.PredicateHomeWork;
import lesson12.funktionalInterfaceHomeWork.SupplierHomeWork;
import lesson7.domain.Client;

public class Main {
    public static void main(String[] args) {
        PredicateHomeWork<Double> predicateHomeWork = doubleSalary -> doubleSalary > 1500.0;
        System.out.println("predicateHomeWork.salary: " + predicateHomeWork.salary(1600.0));
        System.out.println("predicateHomeWork.salary: " + predicateHomeWork.salary(1400.5));

        ConsumerHomeWork<String> consumerHomeWork = string -> {
            char[] chars = string.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                System.out.print("[" + chars[i] + "], ");
            }
        };
        System.out.print("consumerHomeWork.stringToCharArray: ");
        consumerHomeWork.stringToCharArray("Kateryna");
        System.out.println();

        FunctionHomeWork<String, Integer> functionHomeWork = integer -> {
            String string;
            switch (integer) {
                case 1:
                    string = "one";
                    break;
                case 2:
                    string = "two";
                    break;
                case 3:
                    string = "three";
                    break;
                case 4:
                    string = "four";
                    break;
                case 5:
                    string = "five";
                    break;
                case 6:
                    string = "six";
                    break;
                case 7:
                    string = "seven";
                    break;
                case 8:
                    string = "eight";
                    break;
                case 9:
                    string = "nine";
                    break;
                case 10:
                    string = "ten";
                    break;
                default:
                    string = "unknown";
            }
            return string;
        };
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
}
