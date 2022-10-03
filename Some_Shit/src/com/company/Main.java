package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        new MyForm();

        Circle firstCircle = new Circle(10);
        Circle secondCircle = new Circle(6);

        System.out.println(firstCircle.square());
        System.out.println(firstCircle.lLength());
    }
}
