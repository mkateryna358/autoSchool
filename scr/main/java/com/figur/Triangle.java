package com.figur;

public class Triangle extends Figur {
    private double height, base;

    public Triangle() {
        super.setName("Трикутник");
    }

    @Override
    public void setRandomFiguresParameter() {
        height = 1.0 + (9.0 * random.nextDouble());
        base = 1.0 + (9.0 * random.nextDouble());
    }

    @Override
    public double getArea() {
        return Math.round(height * base * 0.5 * 10.0) / 10.0;
    }
}
