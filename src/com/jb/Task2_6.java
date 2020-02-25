//Составить программу, которая определит по трем введенным сторонам, является
//ли данный треугольник равносторонним.

package com.jb;

import java.util.Scanner;

public class Task2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        double a = scanner.nextDouble();
        System.out.println("Введите b:");
        double b = scanner.nextDouble();
        System.out.println("Введите c:");
        double c = scanner.nextDouble();

        if ((a == b) && (b == c)) {
            System.out.println("Треугольник является равносторонним");
        } else {
            System.out.println("Треугольник не является равносторонним");
        }
    }
}
