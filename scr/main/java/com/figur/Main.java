package com.figur;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Figur[] figures = new Figur[10];
        Random random = new Random();

        for (int i = 0; i < figures.length; i++) {
            int figurType = random.nextInt(3);
            switch (figurType) {
                case 0 -> {
                    figures[i] = new Circle();
                    figures[i].setFigurParameters();
                }
                case 1 -> {
                    figures[i] = new Triangle();
                    figures[i].setFigurParameters();
                }
                case 2 -> {
                    figures[i] = new Square();
                    figures[i].setFigurParameters();
                }
            }
        }

        for (int i = 0; i < figures.length - 1; i++) {
            int minElementIndex = i;
            for (int k = i + 1; k < figures.length; k++) {
                if (figures[minElementIndex].getArea() > figures[k].getArea()) {
                    minElementIndex = k;
                }
            }
            if (minElementIndex != i) {
                Figur temp = figures[i];
                figures[i] = figures[minElementIndex];
                figures[minElementIndex] = temp;
            }
        }

        System.out.println("----Відсортовано за площею фігур в порядку зростання----");
        for (Figur f : figures) {
            f.printFigursElements();
        }
    }
}
