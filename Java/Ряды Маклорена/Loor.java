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

    public static double pow(double st, double tt) {
        double tst=1;
        if (st==0){
            return 1;
        }
        else {
            for (int b = 1; b <= st; b++) {
                tst *= tt;}
        }
        return (tst);
    }
}
