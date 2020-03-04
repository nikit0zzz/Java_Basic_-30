//Напишите консольное приложение, проверяющее знание таблицы умножения.

package com.jb;

import java.util.Scanner;
import java.util.Random;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long examples = Math.round(Math.random()*(25-5) + 1);
        int right_answers = 0;
        int bad_answer = 0;
        for (int i = 0; i < examples; i++){
            long a = Math.round(Math.random()*(9-1) + 1);
            long b = Math.round(Math.random()*(9-1) + 1);
            System.out.println(a + " x " + b + " = ?");
            int answer = scanner.nextInt();
            if (a * b == answer){
                System.out.println("Верно!");
                right_answers++;
            } else {
                System.out.println("Не правильный ответ!");
                bad_answer++;
            }
        }
        System.out.println("Вы ответили правильно " + right_answers + " раз");
        System.out.println("Вы ответили не правильно " + bad_answer + " раз");
        System.out.println("Вы правильно ответили на " + (Math.round((Math.floor(right_answers)/Math.floor(examples) * 100))) +"% вопросов");
        if(Math.round((Math.floor(right_answers)/Math.floor(examples) * 100)) <= 97){
            System.out.println("Вы правильно ответили на " + (Math.round((Math.floor(right_answers)/Math.floor(examples) * 100))) +"% вопросов и вы чмо необразованное");
        } else {
            System.out.println("Вы правильно ответили на " + (Math.round((Math.floor(right_answers)/Math.floor(examples) * 100))) + "% вопросов и вы Эйнштейн!!!");
        }
    }
}
