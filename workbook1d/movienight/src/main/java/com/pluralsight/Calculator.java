package com.pluralsight;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        float result = 0;
        boolean isValid = true;

        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("What do you want to do? Reply with (add, subtract, multiply or divide) : ");
        String operator = scanner.nextLine();

        if(operator.equalsIgnoreCase("add")) {
            result = num1 + num2;
        }else if (operator.equalsIgnoreCase("subtract")){
            result = num1 - num2;
        }else if (operator.equalsIgnoreCase("multiply")){
            result = num1 * num2;
        } else if (operator.equalsIgnoreCase("divide")) {
            result = num1 / num2;
        }else {
            isValid = false;
        }

        if(isValid){
            System.out.printf("Result is : %.2f", result);
        }else{
            System.out.println("Invalid operator.");
        }
    }
}
