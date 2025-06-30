package com.task7.exeption1;

public class DeclaredExeption {
    public static void main(String[] args) throws InterruptedException {
        /*
        Create two classes
        Implement the next code inside them:
        Thread.sleep(); with parameter of 3 seconds in two different ways
        - via try/catch
        - specify the type of generated exception when declaring the method
         */
        for (int i = 0; i < 10; i++) {
            Thread.sleep(3000);
            System.out.println(i);
        }
    }


}
