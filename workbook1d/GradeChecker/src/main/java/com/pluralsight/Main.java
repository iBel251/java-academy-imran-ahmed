package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your exam score(0-100): ");
        float score = scanner.nextFloat();
        char grade = 'A';

        if(score >= 90) {
            grade = 'A';
        } else if(score >= 80){
            grade = 'B';
        } else if(score >= 70){
            grade = 'C';
        }else if(score >= 60){
            grade = 'D';
        }else if(score < 60){
            grade = 'F';
        }

        if(score < 0 || score > 100) {
            System.out.println("Invalid score.");
        } else {
            System.out.printf("Your grade is %c",grade);
        }
    }
}