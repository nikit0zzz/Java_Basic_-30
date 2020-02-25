//Найдите количество четных цифр данного натурального числа
package com.jb;

import java.util.Scanner;

public class Task2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        long x = scanner.nextLong();
        int i, j;
        j = 0;
        String s=String.valueOf(x);

        for (i = 0; i < s.length(); i++){
            if(s.charAt(i) % 2 == 0){
                j++;
            }
        }
        System.out.println("Четных чтсел в данном числе: " + j);
    }
}
