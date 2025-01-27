package com.task1.primitivetypes;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("What is your name? Enter please: ");
        printHelloName();
    }

    public static void printHelloName() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " +  name +"!");
    }
}
