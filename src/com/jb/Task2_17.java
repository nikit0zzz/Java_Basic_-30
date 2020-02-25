//Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1).
package com.jb;

import java.util.Scanner;

public class Task2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int n = scanner.nextInt();

        int i;
        long p;
        p = 1;
        for (i = 0; i < n; i++){
            p = p * (a + i);
        }
        System.out.println("a(a+1)...(a+n-1) = " + p);
    }
}
