package com.jb;

public class Task1_4 {
    public static void main(String[] args) {
        double a, b, c, s;
        a = 5.6; //катет 1
        b = 6.5; //катет 2
        c = Math.sqrt(a * a + b * b);
        s = 0.5 * a * b;
        System.out.println("Гипотенуза = " + c);
        System.out.println(" Площадь = " + s);
    }
}
