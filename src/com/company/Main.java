package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random randomizer = new Random();
        System.out.println("I cant decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");

        int x = randomizer.nextInt(5);

        System.out.println("The number we chose was: " + x);

        if (x == 0) {
            System.out.println("Llamas are the best!");
        } else if (x == 1) {
            System.out.println("Dods are the best!");
        } else if (x == 2) {
            System.out.println("Woolly mammoths are DEFINATELY the best!");
        } else if (x == 3) {
            System.out.println("Sharks are the greatest, they have their own week!");
        } else if (x == 4) {
            System.out.println("Cockatoos are just awesome!");
        } else if (x == 5) {
            System.out.println("Have you ever met a Mole-Rat? They're great!");
        }
        System.out.println("Thanks random, you're the best!");

    }
}
