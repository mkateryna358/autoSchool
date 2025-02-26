package com.task4.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        firstTaskInitializeArray();
        task2();
        task3();
        task4();
        task5();
        fifthTaskNewApproach();
    }

    /*
    Максимальное среди массива на 20 чисел
    1. В методе initializeArray():
    1.1. Создайте массив на 20 чисел
    1.2. Считайте с консоли 20 чисел и заполните ими массив
    2. Метод max(int[] array) должен находить максимальное число из элементов массива
     */
    public static void firstTaskInitializeArray() {
        System.out.print("Введіть 20 будь-яких цілих чисел: ");
        Scanner scan = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        max(array);
    }

    public static void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Максимальне число: " + max);
    }

    /*
    Массив из строчек в обратном порядке
    1. Создать массив на 10 строчек.
    2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
    3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке.
    Каждый элемент - с новой строки.
     */
    public static void task2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть 8 будь-яких рядків: ");
        String[] arrayStrings = new String[10];
        for (int i = 0; i < 8; i++) {
            arrayStrings[i] = reader.readLine();
        }
        for (int i = arrayStrings.length - 1; i >= 0; i--) {
            System.out.println(arrayStrings[i]);
        }
    }

    /*
    2 массива
    1. Создать массив на 10 строк.
    2. Создать массив на 10 чисел.
    3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
    4. В каждую ячейку массива чисел записать длину строки из массива строк,
    индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
    5. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
     */
    public static void task3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть 10 будь-яких рядків: ");
        String[] arrayStrings = new String[10];
        int[] arrayNumbers = new int[10];
        for (int i = 0; i < arrayStrings.length; i++) {
            arrayStrings[i] = reader.readLine();
        }
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = arrayStrings[i].length();
            System.out.println(i + ": " + arrayNumbers[i]);
        }
    }

    /*
    Массив из чисел в обратном порядке
    1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
    3. Расположить элементы массива в обратном порядке.
    4. Вывести результат на экран, каждое значение выводить с новой строки.
     */
    public static void task4() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть 10 будь-яких цілих чисел: ");
        int[] arrayStrings = new int[10];
        for (int i = 0; i < arrayStrings.length; i++) {
            arrayStrings[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < arrayStrings.length; i++) {
            System.out.println(arrayStrings[i]);
        }
        for (int i = arrayStrings.length - 1; i >= 0; i--) {
            System.out.println(arrayStrings[i]);
        }
    }

    /*
    Один большой массив и два маленьких
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
    вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
     */
    public static void task5() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть 20 будь-яких цілих чисел: ");
        int[] bigArray = new int[20];
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }
        int arrayMid = bigArray.length / 2;
        int[] smallArray1 = Arrays.copyOf(bigArray, arrayMid);
        //System.out.println(Arrays.toString(smallArray1));
        int[] smallArray2 = Arrays.copyOfRange(bigArray, arrayMid, bigArray.length);
        for (int j : smallArray2) {
            System.out.println(j);
        }
    }

    public static void fifthTaskNewApproach() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть 20 будь-яких цілих чисел: ");
        int[] bigArray = new int[20];
        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
            if (i < smallArray1.length) {
                smallArray1[i] = bigArray[i];
            } else {
                smallArray2[i - smallArray2.length] = bigArray[i];
            }
        }
        for (int i : smallArray2) {
            System.out.println(i);
        }
    }
}
