//Найти max{min(a, b), min(c, d)}
package com.jb;

import java.util.Scanner;

public class Task2_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число:");
        double c = scanner.nextDouble();
        System.out.println("Введите четвертое число:");
        double d = scanner.nextDouble();

        System.out.println("max{min(a, b), min(c, d)} = " + Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
