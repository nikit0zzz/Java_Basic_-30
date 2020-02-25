//Составить программу, которая определит площадь какого круга меньше
package com.jb;

import java.util.Scanner;

public class Task2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите r1:");
        double r1 = scanner.nextDouble();
        System.out.println("Введите r2:");
        double r2 = scanner.nextDouble();

        double s1 = Math.PI * Math.pow(r1, 2);
        double s2 = Math.PI * Math.pow(r2, 2);

        System.out.println(s1);
        System.out.println(s2);

        if (s1 < s2){
            System.out.println("Площадь первого круга меньше");
        } else if (s2 < s1) {
            System.out.println("Площадь второго круга меньше");
        } else if (s1 == s2) {
            System.out.println("Площади кругов равны");
        }
    }
}
