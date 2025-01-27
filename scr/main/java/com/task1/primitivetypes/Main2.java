package com.task1.primitivetypes;
import com.task1.primitivetypes.welcome.Hello;
import java.util.Scanner;

public class Main2 {
    public static void main (String[] args) {
        System.out.println("What is your name? Enter please: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        Hello person = new Hello();
        person.setupName(name);
        person.welcome();
        System.out.println("Hello world!");
        person.byeBay();
    }
}
