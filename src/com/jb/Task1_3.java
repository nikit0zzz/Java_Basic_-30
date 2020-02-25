//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
//шагом h. Результат представить в виде таблицы, первый столбец которой – значения
//аргумента, второй - соответствующие значения функции: F(x) = 2tg(x/2)+1
package com.jb;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = scanner.nextInt();
        System.out.println("Введите b:");
        int b = scanner.nextInt();
        System.out.println("Введите h:");
        float h = scanner.nextFloat();

        float x;
        double f;
        x = a;
        System.out.format("+-----+-------------------------+%n");
        System.out.format("| Arg |            F(X)         |%n");
        System.out.format("+-----+-------------------------+%n");
        while (x < b ){
            f = 2 * Math.tan(x/2) + 1;
            x+=h;
            if (x==0) {
                x+=h;
            }
            System.out.format("| %-3s | %23s |%n", x, f);
        }
        System.out.format("+-----+-------------------------+%n");
    }
}
