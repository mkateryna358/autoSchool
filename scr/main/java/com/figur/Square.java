package com.figur;

public class Square extends Figur {
    private double length;

    public Square() {
        super.setName("Квадрат");
    }

    @Override
    public void setRandomFiguresParameter() {
        length = 1.0 + 9.0 * random.nextDouble();
    }

    @Override
    public double getArea() {
        double area = Math.round(length * length * 10.0) / 10.0;  //отут можна покращити формулу, зробити в квадраті
        return area;
    }
}
