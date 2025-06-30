package com.task7.exeption1;

public class TryCatchExeption {
    /*
        Create two classes
        Implement the next code inside them:
        Thread.sleep(); with parameter of 3 seconds in two different ways
        - via try/catch
        - specify the type of generated exception when declaring the method
         */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
