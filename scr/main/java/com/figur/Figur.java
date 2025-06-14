package com.figur;

import java.util.Arrays;
import java.util.Random;

public abstract class Figur {
    protected String name;
    protected double firstCoordinate;
    protected double secondCoordinate;
    protected static final Random random = new Random();

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName() {
        return name;
    }

    public abstract void setRandomFiguresParameter();

    public void setCoordinates() {
        firstCoordinate = Math.round((1.0 + 9.0 * random.nextDouble()) * 100.0) / 100.0;
        secondCoordinate = Math.round((1.0 + 9.0 * random.nextDouble()) * 100.0) / 100.0;
    }

    public double[] getCoordinates() {
        return new double[]{firstCoordinate, secondCoordinate};
    }

    public abstract double getArea();

    public void printFigursElements() {
        System.out.print("Ім'я фігури:" + getName() + "; ");
        System.out.print("Площа фігури: " + getArea() + "; ");
        System.out.println("Координати фігури: " + Arrays.toString(getCoordinates()) + " ");
    }

    public void setFigurParameters() {
        setRandomFiguresParameter();
        setCoordinates();
    }
}
