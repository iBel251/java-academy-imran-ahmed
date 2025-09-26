package com.pluralsight;

public class MethodDemo {
    public static void main(String[] args){
        int age = 23;
        ageDoubler(age);
        retirementCalculator(age);
    }

    public static void ageDoubler(int age){
        age *= 2;
        System.out.println(age);
    }

    public static void retirementCalculator(int age){
        final int retirementAge = 62;
        int remainingYears  = retirementAge - age;

        System.out.printf("You need to work %d more years to retire.",remainingYears);
    }
}
