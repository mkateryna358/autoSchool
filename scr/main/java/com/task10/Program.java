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

        System.out.println("-----populateDataOnlyForDeclaredFields-----");
        Student student1 = new Student();
        Program.populateDataOnlyForDeclaredFields(student1);
        student1.printData();

        Teacher teacher1 = new Teacher();
        Program.populateDataOnlyForDeclaredFields(teacher1);
        teacher1.printData();

        System.out.println("-----populateDataForAllAvailableFields-----");
        Student student2 = new Student();
        Program.populateDataForAllAvailableFields(student2);
        student2.printData();

        Teacher teacher2 = new Teacher();
        Program.populateDataForAllAvailableFields(teacher2);
        teacher2.printData();
    }

    public static void populateDataOnlyForDeclaredFields(Object obj) throws NoSuchFieldException, IllegalAccessException {

        Field field1 = obj.getClass().getDeclaredField("name");
        field1.setAccessible(true);
        field1.set(obj, generateRandomString(5));

        Field field2 = obj.getClass().getDeclaredField("lastName");
        field2.setAccessible(true);
        field2.set(obj, generateRandomString(7));
    }

    public static void populateDataForAllAvailableFields(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            field.set(obj, generateRandomString(7));
        }
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
