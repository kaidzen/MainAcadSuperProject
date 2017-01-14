package org.kiadzen.lab1_4;

/**
 * Created by Fortune on 14.01.2017.
 */
public class Lab1_4_5 {

    public static void main(String[] args) {
        int a = 48;
        int b = a;
        int c = a>>2;
        int d = a<<3;

        System.out.println("Before: variables a=" +a+ " and b=" +b);

        System.out.println("Shift right a for 2 in: c = "+c);
        System.out.println("Divided by 2: b = " +b/2/2);
        System.out.println("Shift left a for 3 in: d = " +d);
        System.out.println("Multiplayed by 2: b = " +b*2);
    }
}
