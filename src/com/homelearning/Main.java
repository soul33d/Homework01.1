package com.homelearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printGreeting(askName());
    }

    private static String askName() {
        System.out.println("Enter Your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return name;
    }
    private static void printGreeting(String name){
        System.out.println("Hello, " + name);
    }
}
