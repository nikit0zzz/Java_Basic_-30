//Напишите консольное приложение – конвертер валют.

package com.jb;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        String[][] arr = new String[10][5];
        arr[0][0] = "1";
        arr[0][1] = "USD";
        arr[0][2] = "US Dollar";
        arr[0][3] = "1.0000000000";
        arr[0][4] = "1.0000000000";
        arr[1][0] = "2";
        arr[1][1] = "EUR";
        arr[1][2] = "Euro";
        arr[1][3] = "0.8981145680";
        arr[1][4] = "1.1134436915";
        arr[2][0] = "3";
        arr[2][1] = "GBP";
        arr[2][2] = "British Pound";
        arr[2][3] = "0.7776603114";
        arr[2][4] = "1.2859084942";
        arr[3][0] = "4";
        arr[3][1] = "INR";
        arr[3][2] = "Indian Rupee";
        arr[3][3] = "73.4932632893";
        arr[3][4] = "0.0136066893";
        arr[4][0] = "5";
        arr[4][1] = "CHF";
        arr[4][2] = "Swiss Franc";
        arr[4][3] = "0.9559381279";
        arr[4][4] = "1.0460928075";
        arr[5][0] = "6";
        arr[5][1] = "JPY";
        arr[5][2] = "Japanese Yen";
        arr[5][3] = "107.4394643868";
        arr[5][4] = "0.0093075669";
        arr[6][0] = "7";
        arr[6][1] = "CNY";
        arr[6][2] = "Chinese Yuan Renminbi";
        arr[6][3] = "6.9359478324";
        arr[6][4] = "0.1441764016";
        arr[7][0] = "8";
        arr[7][1] = "SAR";
        arr[7][2] = "Saudi Arabian Riyal";
        arr[7][3] = "3.7500000000";
        arr[7][4] = "0.2666666667";
        arr[8][0] = "9";
        arr[8][1] = "BRL";
        arr[8][2] = "Brazilian Real";
        arr[8][3] = "4.5658827921";
        arr[8][4] = "0.2190156965";
        arr[9][0] = "10";
        arr[9][1] = "RUB";
        arr[9][2] = "Russian Ruble";
        arr[9][3] = "66.2940393750";
        arr[9][4] = "0.0150843124";

        String cur_list = "";
        System.out.format("+-----+---------------+---------------------------+-------------------+------------------+%n");
        System.out.format("|  №  | Currency code |       Currency name       |   Units per USD   |   USD per Unit   |%n");
        System.out.format("+-----+---------------+---------------------------+-------------------+------------------+%n");
        for (int i = 0; i < arr.length; ++i) {
            System.out.format("| %3s | %13s | %-25s | %17s | %16s |%n", arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4]);
            cur_list = arr[i][1] + " , " + cur_list;
        }
        System.out.format("+-----+---------------+---------------------------+-------------------+------------------+%n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите исходную валюту (" + cur_list + "):");
        String cur_1 = scanner.next().toUpperCase();
        while (!cur_list.contains(cur_1)) {
            System.out.println("Нет такой валюты, введите еще раз");
            cur_1 = scanner.next().toUpperCase();
        }
        System.out.println("Введите количество:");
        double x = scanner.nextDouble();
        System.out.println("Введите в какую валюту перевести (" + cur_list + "):");
        String cur_2 = scanner.next().toUpperCase();
        while (!cur_list.contains(cur_2)) {
            System.out.println("Нет такой валюты, введите еще раз");
            cur_2 = scanner.next().toUpperCase();
        }
        String units_per_usd = "";
        String usd_per_unit = "";
        for (int j = 0; j < arr.length; ++j){
            if (arr[j][1].contains(cur_1)){
                usd_per_unit = arr[j][4];
            }
        }
        for (int k = 0; k < arr.length; ++k){
            if (arr[k][1].contains(cur_2)){
                units_per_usd = arr[k][3];
            }
        }
        float y = Float.parseFloat(usd_per_unit);
        float z = Float.parseFloat(units_per_usd);
        double xy = x * y;
        double xyz = xy * z;
        System.out.println(x + " " + cur_1 + " = " + xyz + " " + cur_2);
    }
}
