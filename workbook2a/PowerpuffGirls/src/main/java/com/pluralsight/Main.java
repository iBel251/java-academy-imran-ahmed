package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Todo: A Powerpuff fighting game
            // Features
            // Play online, play solo

            //Customizing Characters
        PowerpuffGirl blossom = new PowerpuffGirl("Blossom","Pink");
        blossom.setHealth(30);
        System.out.println(blossom.getHealth());
        blossom.heal(20);
        System.out.println(blossom.getHealth());
    }
}