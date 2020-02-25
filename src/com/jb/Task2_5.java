//Составить программу нахождения наименьшего из квадратов двух чисел а и b.
package com.jb;

import java.util.Scanner;

public class Task2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        double a = scanner.nextDouble();
        System.out.println("Введите b:");
        double b = scanner.nextDouble();

        System.out.println(Math.min(a * a, b * b));
    }
}
