package com.jb;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        float dig_1 = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float dig_2 = scanner.nextFloat();

        if (dig_1 < dig_2) {
            System.out.println("7");
        } else {
            System.out.println("8");
        }

        if (dig_1 < dig_2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println("Введите еще какое-нибудь число (a):");
        float a = scanner.nextFloat();
        if (a < 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        scanner.close();
    }
}
