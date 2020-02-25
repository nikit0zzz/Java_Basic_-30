//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных
//значениях a, b, c и х.
package com.jb;

import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        double a = scanner.nextDouble();
        System.out.println("Введите b:");
        double b = scanner.nextDouble();
        System.out.println("Введите c:");
        double c = scanner.nextDouble();
        System.out.println("Введите x:");
        double x = scanner.nextDouble();

        System.out.println(Math.abs(a * x * x + b * x + c));
    }
}
