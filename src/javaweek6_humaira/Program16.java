package javaweek6_humaira;

import java.util.Scanner;

/*
16. Write a Java program to add two binary numbers.
Input Data: Input first binary number: 10 Input second binary number: 11
Expected Output: Sum of two binary numbers: 101
 */
public class Program16 {

    public static void main(String[] args) {

        String number1 = "10";
        String number2 = "11";

        String addition = add (number1, number2);
        System.out.println("First  Binary Number: " + number1);
        System.out.println("Second Binary Number: " + number2);
        System.out.println("addition of two binary number is : " + addition);
    }

    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }
}