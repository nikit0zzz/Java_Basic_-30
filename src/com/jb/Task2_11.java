//Даны два числа. Определить цифры, входящие в запись как первого так и второго
//числа. 32.
package com.jb;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        String s1=String.valueOf(a);
        String s2=String.valueOf(b);

        System.out.println(s1.length());
        int i, j;
        System.out.println("Строка 1 состоит из " + s1.length() + " символов :");
        for (i = 0; i < s1.length(); i++){
            System.out.println(s1.charAt(i));
        }
        System.out.println("Строка 2 состоит из " + s2.length() + " символов :");
        for (j = 0; j < s2.length(); j++){
            System.out.println(s2.charAt(j));
        }
    }
}
