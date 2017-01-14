package org.kiadzen.lab1_4;

/**
 * Created by Fortune on 14.01.2017.
 */
public class Lab1_4_4 {

    public static void main(String[] args) {
        int a = 4;
        System.out.println("Var: a= " +a);
        System.out.println();

        int b = a++;
        System.out.println("Postincrement: a++");
        System.out.println("b= " +b+ ", and  a= " +a);
        System.out.println();

        int c = ++a;
        System.out.println("Preincrement: ++a");
        System.out.println("c= "+c+", and a= "+a);
        System.out.println();

        int d = a--;
        System.out.println("Postdecrement: a--");
        System.out.println("d= " +d+ ", and a= "+a);
        System.out.println();

        int e = --a;
        System.out.println("Predecrement: --a");
        System.out.println("e= " +e+ ", and a= "+a);
    }
}
