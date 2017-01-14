package org.kiadzen.lab1_4;

/**
 * Created by Fortune on 14.01.2017.
 */
public class Lab1_4_7 {

    public static void main(String[] args) {
        int a;
        int var = (int) (Math.random()*100);

        boolean rnd = var % 2 == 0;
        a = rnd ? 2000 : 1500;

        System.out.println("Conditions is " +rnd+ " ,so it will be: " +a);
    }
}
