//Составить программу: равны ли два числа а и b?
package com.jb;

import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float dig_1 = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float dig_2 = scanner.nextFloat();

        if (dig_1 == dig_2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("Числа не равны");
        }
    }
}
