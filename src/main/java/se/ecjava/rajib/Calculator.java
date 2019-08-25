package se.ecjava.rajib;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {

        boolean keepAlive = true;
        while (keepAlive) {
            System.out.println("Enter the first number: ");
            double inputOne = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter a mathematical operator");
            String mathOperator = scanner.nextLine().trim();
            System.out.println("Enter the second number: ");
            double inputTwo = Double.parseDouble(scanner.nextLine());
            switch (mathOperator) {
                case "+":
                    System.out.println(addOperation(inputOne, inputTwo));
                    break;
                case "-":
                    System.out.println(subtractOperation(inputOne, inputTwo));
                    break;
                case "*":
                    System.out.println(multiplyOperation(inputOne, inputTwo));
                    break;
                case "/":
                    System.out.println(divideOperation(inputOne, inputTwo));
                    break;
                default:
                    System.out.println("Unrecognized math operator!");
            }
            System.out.println("If you want to continue press 1 otherwise press 0");
            int calculatorRunner = Integer.parseInt(scanner.nextLine());
            if (calculatorRunner == 0) {
                keepAlive = false;
            }
        }
    }

    public static double addOperation (double addInputOne, double addInputTwo) {
        double result = addInputOne + addInputTwo;
        return result;
    }

    public static double subtractOperation (double subInputOne, double subInputTwo) {
        double result = subInputOne - subInputTwo;
        return result;
    }

    public static double multiplyOperation (double multipInputOne, double multipInputTwo) {
        double result = multipInputOne * multipInputTwo;
        return result;
    }

    public static  double divideOperation (double divInputOne, double divInputTwo) {
        double result = divInputOne / divInputTwo;
        return result;
    }
}
