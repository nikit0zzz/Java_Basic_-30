//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15.
package com.jb;

public class Task2_14 {
    public static void main(String[] args) {
        int i, j, k ,l , sum;
        for (i = 1; i <= 9; i++){
            for (j = 1; j <= 9; j++){
                for (k = 1; k <= 9; k++){
                    for (l = 1; l <= 9; l++){
                        sum = i + j + k + l;
                        if (sum == 15){
                            System.out.println("Число, цифр каждого из которых равна 15 это " + i + j + k + l + "; " + i + "+" + j + "+" + k + "+" + l + " = 15");
                        }
                    }
                }
            }
        }
    }
}
