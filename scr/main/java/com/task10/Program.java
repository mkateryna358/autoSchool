package com.task10;

import java.lang.reflect.Field;
import java.util.Random;

public class Program {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /*
        Create a parent class that has several successor classes and a Program class.
        Each of the descendant classes contains only private String fields and an empty constructor.
        Implement a method in the Program class that will take an Object and populate each field with random data.
        Implement a method in the parent class that will return the value and name of each field
        in the successor class and output to the console.
         */

        Students students = new Students();
        Program.populateData(students);
        students.printData();

        Teachers teachers = new Teachers();
        Program.populateData(teachers);
        teachers.printData();
    }

    public static void populateData(Object obj) throws NoSuchFieldException, IllegalAccessException {

        Field field1 = obj.getClass().getDeclaredField("name");
        field1.setAccessible(true);
        field1.set(obj, generateRandomString(5));

        Field field2 = obj.getClass().getDeclaredField("lastName");
        field2.setAccessible(true);
        field2.set(obj, generateRandomString(7));
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            result.append(characters.charAt(index));
        }
        return result.toString();
    }
}
