package com.jb;

public class Task2_13 {
    public static void main(String[] args) {
        double x1, x2, x3, y1, y2, y3, a, b, c, p, s;
        x1 = 3;
        x2 = 7;
        x3 = 1;
        y1 = 2;
        y2 = 5;
        y3 = 1;
        a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        c = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        p = a + b + c;
        s = p / 2;
        System.out.println("Периметр = " + p);
        System.out.println("Площадь = " + s);
    }
}
