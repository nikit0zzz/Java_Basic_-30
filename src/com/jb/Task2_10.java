package com.jb;

public class Task2_10 {
    public static void main(String[] args) {
        double x, y, exp;
        x = 0.5;
        y = 1;
        exp = ((Math.sin(x) + Math.cos(y))/(Math.cos(y) - Math.sin(x))) * Math.tan(x * y);
        System.out.println("Выражение = " + exp);
    }
}
