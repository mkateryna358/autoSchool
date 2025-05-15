package com.figur;

import static java.lang.Math.PI;

public class Circle extends Figur {
    private double radius;

    //Конструктор, щоб при створенні кола одразу вказувати імʼя
    public Circle() {
        //this.radius означає, що ми зберігаємо в змінну класу те, що передали в конструктор при створенні обʼєкту
        //this.radius = radius;
        //super.setRandomName();
        super.setName("Коло");
    }

    @Override
    public void setRandomFiguresParameter() {
        radius = Math.round((1.0 + 9.0 * random.nextDouble()) * 100.0) / 100.0;
    }

    @Override
    public double getArea() {
        return Math.round(radius * 2 * PI * 10.0) / 10.0;
    }
}
