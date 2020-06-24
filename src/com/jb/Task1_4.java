//Вычислить значение функции:
package com.jb;// пакеты следуюет именоварь согласно рекомендациям code connetion, вы не соблюли количество уровней вложенности


import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextFloat();

        if (x <= -3){
            System.out.println("F(x) = " + 9);
        } else if (x > 3) {
            System.out.println("F(x) = " + 1/(Math.pow(x, 2) + 1));
        } else {
            System.out.println("Out of range!!! You need enter between [..-3][3..]");
        }
    }
}
