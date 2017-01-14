package org.kiadzen.lab1_4;

/**
 * Created by Fortune on 15.01.2017.
 */
public class Lab1_4_8 {
    public static void main(String[] args) {
        int valInt = 258;
        byte valByte = (byte) valInt;
        long valLong= 4_500_000_000L;
        int valInt2=(int) valLong;
        double valDouble = 125.78954626546543;
        float valFloat = (float) valDouble;

        System.out.println("Casting int " +valInt+ " to byte: " +valByte);
        System.out.println("Casting long " +valLong+ " to int: " +valInt2);
        System.out.println("Casting double " +valDouble+ " to float: " +valFloat);
    }
}
