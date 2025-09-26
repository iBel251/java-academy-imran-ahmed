package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill the following forms.");
        System.out.print("Principal($): ");
        double principal = scanner.nextDouble();

        System.out.print("Interest rate(%): ");
        float interestRate = scanner.nextFloat()/100;

        System.out.print("Loan length(Year): ");
        int loanLength = scanner.nextInt();

        // First we will calculate the number of months and monthly interest rates.
        int months = 12 * loanLength;
        float monthlyInterestRate = interestRate / 12;

        // Calculation for monthly payment
        float monthlyPayment = (float) (principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate,months) / (Math.pow((1 + monthlyInterestRate),months) - 1)));

        float totalInterest = (float)((monthlyPayment * months) - principal);
        System.out.printf("Monthly payment: %.2f | Total interest: %.2f",monthlyPayment,totalInterest);

    }
}
