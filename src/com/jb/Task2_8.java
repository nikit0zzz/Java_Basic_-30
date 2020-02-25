//Составить программу, которая определит площадь какого треугольника больше.
package com.jb;

import java.util.Scanner;

public class Task2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a1:");
        double a1 = scanner.nextDouble();
        System.out.println("Введите b1:");
        double b1 = scanner.nextDouble();
        System.out.println("Введите c1:");
        double c1 = scanner.nextDouble();

        System.out.println("Введите a2:");
        double a2 = scanner.nextDouble();
        System.out.println("Введите b2:");
        double b2 = scanner.nextDouble();
        System.out.println("Введите c2:");
        double c2 = scanner.nextDouble();
        double s1 = 0;
        double s2 = 0;

        if ((a1 + b1 > c1) &&  (b1 + c1 > a1) && (a1 + c1 > b1)){
            double p1 = (a1 + b1 + c1)/2;
            s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
        } else {
            System.out.println("Такой треугольник существовать не может");
        }

        if ((a2 + b2 > c2) &&  (b2 + c2 > a2) && (a2 + c2 > b2)){
            double p2 = (a2 + b2 + c2)/2;
            s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));
        } else {
            System.out.println("Такой треугольник существовать не может");
        }

        if (s1 > s2) {
            System.out.println("Площадь первого треугольника больше");
        } else if (s2 > s1) {
            System.out.println("Площадь второго треугольника больше");
        } else if (s1 == s2) {
            System.out.println("Площади треугольников равны");
        }
    }
}
