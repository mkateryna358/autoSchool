package com.task2.typecasting;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        int q = 34;
        int w = 8;
        int a = q/w;
        int b = q%w;
        System.out.println(q + "/" + w + "=" + a + " and " + b + " as remainder");
    }

    public static void task2() {
        int n = 56;
        int a = n/10;
        int b = n%10;
        System.out.println(a+b);
    }

    public static void task3(){
        float n = 21.55f;
        int a = Math.round(n);
        System.out.println(a);
    }

    public static void task4(){
        /*
        Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b,
        в b хранилась разность старых значений c−a, а в c хранилось сумма старых значений a+b+c.
        Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.
         */
        int a = 0;
        int b = 2;
        int c = 5;
        int r = a+b;
        int t = c-a;
        int y = a+b+c;
        a = r;
        b = t;
        c = y;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
