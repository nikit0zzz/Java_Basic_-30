package com.jb;

public class Task2_9 {
    public static void main(String[] args) {
        double a, b, c, d, exp;
        a = 1;
        b = 2;
        c = 3;
        d = 4.5;
        exp = ((a / c) * (b / d)) - ((a * b - c)/(c * d));
        System.out.println("Выражение = " + exp);
    }
}
