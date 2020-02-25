package com.jb;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = "";
        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();

        while((line=scanner.nextLine()).length()!=1)
        {
            System.out.println("(Player 2) Please guess only one letter: ");
        }

        System.out.println(a.length());

//        for (i = 0; i <= a.length(); i++){
//            System.out.println(a[]);
//        }
    }
}
