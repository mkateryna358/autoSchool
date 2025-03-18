package com.task5.controlconstracts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task10SecondApproach();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    //1. Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    public static void task1() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть перше число: ");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Введіть друге число: ");
        int secondNumber = Integer.parseInt(reader.readLine());

        if (firstNumber < secondNumber) {
            System.out.println("Мінімальне число: " + firstNumber);
        } else if (secondNumber < firstNumber) {
            System.out.println("Мінімальне число: " + secondNumber);
        } else {
            System.out.println("Числа однакові");
        }
    }

    //2. Ввести с клавиатуры четыре числа, и вывести максимальное из них.
    public static void task2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть чотири числа: ");
        int[] numbers = new int[4];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int max = maxArrayElement(numbers);
        System.out.println("Максимальне число: " + max);
    }

    //3. Ввести с клавиатуры три числа, и вывести их в порядке убывания.
    public static void task3() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть три числа: ");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int maxElement = maxArrayElement(numbers);
        int minElement = minArrayElement(numbers);
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        if (a == maxElement && b == minElement) {
            int midElement = c;
            printElements(maxElement, midElement, minElement);
        } else if (a == maxElement && c == minElement) {
            int midElement = b;
            printElements(maxElement, midElement, minElement);
        } else if (b == maxElement && c == minElement) {
            int midElement = a;
            printElements(maxElement, midElement, minElement);
        } else if (b == maxElement && a == minElement) {
            int midElement = c;
            printElements(maxElement, midElement, minElement);
        } else if (c == maxElement && b == minElement) {
            int midElement = a;
            printElements(maxElement, midElement, minElement);
        } else if (c == maxElement && a == minElement) {
            int midElement = b;
            printElements(maxElement, midElement, minElement);
        }
    }

    public static int maxArrayElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int minArrayElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static void printElements(int max, int mid, int min) {
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }

    /*
    4. Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
     */
    public static void task4() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть два імені: ");
        String firstName = reader.readLine();
        String secondName = reader.readLine();
        if (firstName.equals(secondName)) {
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length()) {
            System.out.println("Длины имен равны");
        }
    }

    //5. Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    public static void task5() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть імʼя та вік: ");
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18) {
            System.out.println("Подрасти еще " + name);
        }
    }

    //6. Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
    public static void task6() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть імʼя та вік: ");
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age > 20) {
            System.out.println("И 18-ти достаточно " + name);
        }
    }

    /*7. За семь попыток угадать число. При каждой попытке вам будет выводиться сообщение - "Мало" или "Много".
    Если угадаете, уложившись в семь попыток, то выводится сообщение "Угадал :)" и программа завершает работу.
    Если по истечении 7 попыток число не угадывается, то выводится сообщение "Не угадал :(" и завершается работа.
    Для генерации секретного числа используете код:
    Random random = new Random();
    int secret;
    // Генерируем число от 0 до 20
    secret = random.nextInt(20 + 1);
    */
    public static void task7() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int secret;
        secret = random.nextInt(20 + 1);
        System.out.println("Вгадайте число за 7 спроб: ");
        for (int i = 1; i <= 7; i++) {
            int userNumber = Integer.parseInt(reader.readLine());
            if (userNumber > secret && i < 7) {
                System.out.println("Много");
            } else if (userNumber < secret && i < 7) {
                System.out.println("Мало");
            } else if (userNumber == secret) {
                System.out.println("Угадал :)");
                break;
            } else {
                System.out.println("Не угадал :(");
                break;
            }
        }
    }

    //Задачи на циклы (while)

    //8. Вывести на экран числа от 1 до 10, используя цикл while.
    public static void task8() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
    }

    //9. Вывести на экран числа от 10 до 1, используя цикл while.
    public static void task9() {
        int number = 10;
        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }

    /*
    10. Ввести с клавиатуры строку и число N.
    Вывести на экран строку N раз, используя цикл while.
     */
    public static void task10() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть рядок: ");
        String sentence = reader.readLine();
        System.out.println("Введіть цифру: ");
        int number = Integer.parseInt(reader.readLine());
        int count = 1;
        do {
            System.out.println(sentence);
            count++;
        } while (count <= number);
    }

    public static void task10SecondApproach() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть рядок: ");
        String sentence = reader.readLine();
        System.out.println("Введіть цифру: ");
        int number = Integer.parseInt(reader.readLine());
        int count = 1;
        while (true) {
            System.out.println(sentence);
            if (count >= number) {
                break;
            }
            count++;
        }
    }

    /*
    11. Вывести на экран квадрат из 10х10 букв S используя цикл while.
    Буквы в каждой строке не разделять.
     */
    public static void task11() {
        int length = 1;
        int height = 1;
        while (length <= 10) {
            while (height <= 10) {
                System.out.print("S");
                height++;
            }
            System.out.println();
            length++;
            height = 1;
        }
    }

    /*
    12. Вывести на экран таблицу умножения 10х10 используя цикл while.
    Числа разделить пробелом.
     */
    public static void task12() {
        int i = 1;
        while (i <= 10) {
            int r = 1;
            while (r <= 10) {
                int t = i * r;
                System.out.print(t + " ");
                r++;
            }
            System.out.println();
            i++;
        }
    }

    /*
    13. Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
    Через пробел либо с новой строки.
     */
    public static void task13() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /*
    14. Ввести с клавиатуры два числа m и n.
    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
    Пример: m=2, n=4
    8888
    8888
     */
    public static void task14() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть перше число: ");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Введіть друге число: ");
        int secondNumber = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= firstNumber; i++) {
            for (int j = 1; j <= secondNumber; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }

    /*
    15. Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
    Пример:
    8
    88
    888
     */
    public static void task15() {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    /*
    16. Используя цикл for вывести на экран:
    - горизонтальную линию из 10 восьмёрок
    - вертикальную линию из 10 восьмёрок.
     */
    public static void task16() {
        for (int i = 1; i <= 10; i++) {
            for (int k = 1; k <= 9; k++) {
                if (i == 1) {
                    System.out.print(8);
                }
            }
            System.out.println(8);
        }
    }

    /*
    17. Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
    Пример текста:
    Света любит меня.
     */
    public static void task17() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть імʼя: ");
        String name = reader.readLine();
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }

    /*
    18. Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!».
    Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
    Thread.sleep(100); //задержка на одну десятую секунды.
    Пример:
    30
    29
    …
    1
    0
    Бум!
     */
    public static void task18() throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            Thread.sleep(100);
            System.out.println(i);
        }
        System.out.println("Бум!");
    }
}
