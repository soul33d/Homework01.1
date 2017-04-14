package com.homelearning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printGreeting(askName());
    }

    private static String askName() {
        System.out.println("Enter Your name");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    private static void printGreeting(String name){
        System.out.println("Hello, " + name);
    }
}
