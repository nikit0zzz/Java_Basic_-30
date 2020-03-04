package com.jb;

import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long examples = Math.round(Math.random()*(10-3));
        int right_answers = 0;
        int bad_answer = 0;
        for (int i = 0; i < examples; i++){
            long a = Math.round(Math.random()*(9-1) + 1);
            long b = Math.round(Math.random()*(9-1) + 1);
            System.out.println(a + " * " + b + "= ?");
            int answer = scanner.nextInt();
            if (a * b == answer){
                System.out.println("Верно!");
                right_answers++;
            } else {
                System.out.println("Неудачник!");
                bad_answer++;
            }
        }
        System.out.println("right_answers = " + right_answers);
        System.out.println("bad_answer = " + bad_answer);
        System.out.println("Вы правильно ответили на " + (Math.round((Math.floor(right_answers)/Math.floor(bad_answer) * 100))) +"% вопросов");
    }
}
