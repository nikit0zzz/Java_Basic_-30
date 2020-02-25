//Проверить введенную пользователем строку на наличие недопустимых символов.
//В качестве первого символа допустимы только буквы и знак подчеркивания.
//Остальные символы могут быть буквами, цифрами и знаком подчеркивания.
package com.jb;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task2_12 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку:");
//        String s  = scanner.nextLine();
        String s = "strIng01";
        System.out.println(s);
        if (Pattern.matches("[^_a-zA-Z]{1}", s)) {
            if (Pattern.matches("[a-zA-Z0-9]+", s)) {
                System.out.println("ok");
            } else {
                System.out.println("Набор символов не соответствует, должно быть нижнее подчеркивание или буквы или цифры");
            }
        } else {
            System.out.println("Первый символ не соотвествует, должен быть или нижнее подчеркивание или буква");
        }
    }
}
