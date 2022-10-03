package com.company;

public class Circle {

    int radius;

    public Circle (int radius) {
        this.radius = radius;
    }


    public double square() {
        double v = Math.PI * radius * radius;
        return v;
    }

    public double lLength() {
        double v = Math.PI * radius * 2;
        return v;
    }
}
