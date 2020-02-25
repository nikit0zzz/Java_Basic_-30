//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.
package com.jb;

import java.util.Scanner;

public class Task2_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число:");
        double c = scanner.nextDouble();
        System.out.println("Введено: a = " + a + "; b = " + b + "; c = " + c);

        if (a < 0) {
            a = Math.pow(a, 4);
        } else {
            a = Math.pow(a, 2);
        }

        if (b < 0) {
            b = Math.pow(b, 4);
        } else {
            b = Math.pow(b, 2);
        }

        if (c < 0) {
            c = Math.pow(c, 4);
        } else {
            c = Math.pow(c, 2);
        }

        System.out.println("Результат: a = " + a + "; b = " + b + "; c = " + c);
    }
}
