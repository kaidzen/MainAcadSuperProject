package org.kiadzen.lab1_4;

/**
 * Created by Fortune on 14.01.2017.
 */
public class Lab1_4_6 {

    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = a & b;
        int d = a | b;
        int e = a ^ b;

        System.out.println("Binary a = " +Integer.toString(a,2)+ ",\t in decimal: " +a);
        System.out.println("Binary b = " +Integer.toString(b,2)+ ",\t in decimal: " +b);
        System.out.println("Binary c = " +Integer.toString(c,2)+ ",\t in decimal: " +c);
        System.out.println("Binary d = " +Integer.toString(d,2)+ ",\t in decimal: " +d);
        System.out.println("Binary e = " +Integer.toString(e,2)+ ",\t in decimal: " +e);
    }
}
