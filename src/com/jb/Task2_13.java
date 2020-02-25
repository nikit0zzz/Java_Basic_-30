//Найдите наибольшую цифру данного натурального числа
package com.jb;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Task2_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        String s = scanner.nextLine();

        int max = s.chars().max().getAsInt();
        System.out.println("Наибольшая цифра в введеном числе = " + Character.getNumericValue((char) max));
    }
}
