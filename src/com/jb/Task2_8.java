package com.jb;

public class Task2_8 {
    public static void main(String[] args) {
        double a, b, c, exp;
        a = 1;
        b = 2;
        c = 3.4;
        exp = ((b - Math.sqrt(Math.pow(b, 2) + 4 * a * c))/ 2 * a) - Math.pow(a, 3) * c - Math.pow(b, -2);
        System.out.println("ыражение = " + exp);
    }
}
