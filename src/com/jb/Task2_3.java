//Составить программу: определения наибольшего из двух чисел а и b
package com.jb;

import java.util.Scanner;

public class Task2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double dig_1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double dig_2 = scanner.nextDouble();

        System.out.println("max = " + Math.max(dig_1, dig_2));
    }
}
