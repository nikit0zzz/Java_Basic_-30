//Вывести на экран соответствий между символами и их численными обозначениями
//в памяти компьютера (Таблицу ASCII)
package com.jb;

public class Task2_19 {
    public static void main(String[] args) {
        int c1;
        System.out.format("+-----+-----+-----+-----+%n");
        System.out.format("|   0-128   |  128-255  |%n");
        System.out.format("+-----+-----+-----+-----+%n");
        for (int c=0; c<128; c++) {
            c1 = c + 128;
            System.out.format("| %-3s | %3s | %-3s | %3s |%n", c, (char)c, c + 128, (char)c1);
        }
        System.out.format("+-----+-----+-----+-----+%n");
    }
}
