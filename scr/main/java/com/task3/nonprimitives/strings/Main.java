package com.task3.nonprimitives.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1(){
        /*
        Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку.
        Также предусмотрите вывод количества пробелов.
         */
        String str1 = "Hi, my name is Kate. I was born in Lozova.";
        int strIndex = str1.indexOf(" I");
        str1 = str1.substring(0,strIndex);
        System.out.println(str1);
    }

    public static void task2(){
        //Дана строка. Вывести первый, последний и средний (если он есть) символы.
        String str1 = "Hi, my name is Kate. I was born in Lozova.";
        char firstSymbol = str1.charAt(0);
        char middleSymbol = str1.charAt(10);
        char lastSymbol = str1.charAt(str1.length()-1);
        System.out.println(firstSymbol);
        System.out.println(middleSymbol);
        System.out.println(lastSymbol);
    }

    public static void task3(){
        /*
        Найти в строке указанную подстроку и заменить ее на новую.
        Строку, ее подстроку для замены и новую подстроку вводит пользователь
         */
        System.out.println("Hi, I have a task for you. Could you enter the sentence:");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        System.out.println(userInput);
        System.out.println("Can you specify the word that should be replaced:");
        String userWordToChange = scan.nextLine();
        System.out.println("Can you specify the word to replace it with:");
        String userWordForReplacement = scan.nextLine();
        String newUserInput = userInput.replace(userWordToChange,userWordForReplacement);
        System.out.println("Here is the result: " + newUserInput);
    }

    public static void task4(){
        /*
        Вводится строка слов, разделенных пробелами.
        Найти самое длинное слово и вывести его на экран.
        Случай, когда самых длинных слов может быть несколько, не обрабатывать.
         */
        System.out.println("Hi, I have a task for you. Could you enter the sentence:");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        String[] words = userInput.split(" ");
        String longestWord = words[0];
        int maxLength = longestWord.length();
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}
