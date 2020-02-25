//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)
package com.jb;

public class Task2_16 {
    public static void main(String[] args) {
        int s;
        long p;
        s = 3;
        p = 3;
        for(int i=3; i<=10; i++)
        {
            s+=i;
            p*=s;
        }
        System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) = " + p);
    }
}
