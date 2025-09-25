package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main( String[] args){

        Scanner scanner = new Scanner(System.in);
        float grossPay = 0;

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("How many hours worked: ");
        float hours = scanner.nextFloat();

        System.out.print("Pay rate: ");
        float payRate = scanner.nextFloat();

        if(hours > 0 && hours <= 40){
            grossPay = hours * payRate;
        }else if (hours > 40){
            grossPay = (hours-40) * 1.5f * payRate + (40 * payRate);

        }

        System.out.printf("Name: %s | Gross pay: $%.2f",name,grossPay);

    }
}
