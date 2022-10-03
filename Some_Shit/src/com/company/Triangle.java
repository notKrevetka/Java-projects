package com.company;

public class Triangle {
    double st_1, st_2, st_3;

    public Triangle (double st_1, double st_2, double st_3){
        this.st_1 = st_1;
        this.st_2 = st_2;
        this.st_3 = st_3;
    }

    public double perimetr(){
        return st_3 + st_2 + st_1;
    }

    public double square(){
        double p = this.perimetr()/2;
        return Math.sqrt(p*(p-st_2)*(p-st_1)*(p-st_3));
    }

}
