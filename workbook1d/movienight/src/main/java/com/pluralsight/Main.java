package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String movieTitle = "Him";
        int numberOfFriends = 4;
        double pizzaPrice = 3.99;
        double drinkPrice = 2.66;
        boolean getPopcorn = true;
        double totalPizzaPrice = Math.round(pizzaPrice * numberOfFriends);
        double totalPrice = totalPizzaPrice + (drinkPrice * numberOfFriends);

        System.out.println("We will be watching the new movie " + "Him " + "with " + numberOfFriends + " friends and will pay " + totalPizzaPrice + " for the pizza's.");
        System.out.println("Total price for food and drinks is $" + totalPrice);

        if (getPopcorn) {
            System.out.println("Yayyyyyyyyy");
        } else {
            System.out.println("We need popcorn :( ");
        }

        if (totalPizzaPrice > 30){
            System.out.println("Whoa, that's a lot of pizza! 🍕");
        } else {
            System.out.println("Nice budget-friendly movie night!");
        }

        System.out.printf("Movie %s | Guests: %d | Total Cost: $%f.2",movieTitle,numberOfFriends,totalPrice);
    }
}