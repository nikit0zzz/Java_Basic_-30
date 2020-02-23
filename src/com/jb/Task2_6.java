package com.jb;

public class Task2_6 {
    public static void main(String[] args) {
        int m, n, c, v_small, v_big, v_total;
        m = 6;
        n = 12;
        v_small = 80 / n;
        v_big = v_small + 12;
        v_total = v_big * m;
        System.out.println("Всего молока в больших бидонах = " + v_total);
    }
}
