package com.company;

public class Loor {

    private static final int n = 17;

    public static double sin(double x) {
        double s=0;
        for (int i = 0; i< n; i++ ){
            s += (Loor.pow(i, -1) * ( (pow(2*i+1, x)) /(Loor.fac(2*i+1)) ));
            System.out.println("ss " + s);
        }
        return (s);
    }

    public static double exp(double x) {
        double s=0;
        for (int i = 0; i< n; i++ ){
               s += pow(i, x) / fac(i);
            System.out.println("ss " + s);
        }
        return (s);
    }

    public static double fac(double a){
        return (a==0 || a == 1) ? 1 : a * fac(a-1);
    }

    public static double pow(double b, double a) {
        return (b <= 0) ? ((b < 0) ? pow(-b, 1/a) : 1) : (a * pow(b-1, a));
    }
}
