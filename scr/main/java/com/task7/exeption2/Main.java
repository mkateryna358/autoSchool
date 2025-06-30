package com.task7.exeption2;

public class Main {
    public static void main(String[] args) {
        /*
        Create class DeclaredExeption. In any place of the code, insert the following line: int zero = 5/0;
        When executing this code in the console, we will get an exception java.lang.ArithmeticException
        Use try/catch to catch the generated exception and replace it with the text You shall not fall!
         */
        try {
            int zero = 5 / 0;
            System.out.println(zero);
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall!");
        }
    }
}
