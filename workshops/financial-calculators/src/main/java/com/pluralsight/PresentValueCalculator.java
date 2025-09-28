package com.pluralsight;
import java.util.Scanner;

public class PresentValueCalculator {

    public static void main(String[] args){
        // Initiate the scanner
        Scanner scanner = new Scanner(System.in);

        //Collect information from user
        System.out.println("Fill out the following fields.");
        System.out.print("Monthly payout: ");
        double monthlyPayout = scanner.nextDouble();

        System.out.print("Interest rate(%): ");
        double interestRate = scanner.nextDouble() / 100;

        System.out.print("Years to pay: ");
        int years = scanner.nextInt();

        //First calculate the monthly interest rate and number of months
        int months = years * 12;
        double monthlyInterestRate = interestRate / 12;

        //Implement the formula
        double presentValue = monthlyPayout * ((1-Math.pow((1+monthlyInterestRate), -months)) / monthlyInterestRate);

        System.out.printf("Present value is $%.2f%n",presentValue);
    }
}
