package com.pluralsight;
import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill out the following fields");
        System.out.print("Deposit: ");
        int deposit = scanner.nextInt();

        System.out.print("Interest rate(%)");
        float interestRate = scanner.nextFloat() / 100;

        System.out.print("Number of years: ");
        int years = scanner.nextInt();

        // Calculate total number of days
        int days = 365 * years;

        //Calculate future value
        float futureValue = (float)(deposit * (Math.pow((1 + interestRate / 365),(365 * years))));

        //Calculate Interest Earned
        float interestEarned = futureValue - deposit;

        System.out.printf("Future value: %.2f | Interest earned: %.2f", futureValue, interestEarned);

    }
}
