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
        int a = 1;
        int b = 2;
        int c = 3;
        a = a+b;
        b = c-(a-b);
        c = a+c;
        System.out.println("a = a+b = " + a);
        System.out.println("b = c-a = " +b);
        System.out.println("c = a+b+c = " +c);
    }
}
