package lesson10;

import lesson10.exception.WrongValueException;

public class Main {

    public static void main(String[] args) throws WrongValueException {

//        TaskForTest program = new TaskForTest();
//        int[]nums = new int [] {2,7,11,15};
//        System.out.println(program.twoSum(nums, 9));

        ReverseSolution reverseSolution = new ReverseSolution();
        int reverse = reverseSolution.reverse(36469);
        System.out.println(reverse);

//        Calculator calculator = new Calculator();
//        ValidationService validationService = new ValidationService();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int first = scanner.nextInt();
//        System.out.println("Enter second number: ");
//        int second = scanner.nextInt();
//        int plus = calculator.plus(first, second);
//        System.out.println("The sum is: " + plus);

//        boolean result = validationService.checkValue(i);
//        System.out.println("validationService.checkValue: " + result);

    }
}
