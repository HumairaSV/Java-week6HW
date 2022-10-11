package javaweek6_humaira;

import java.util.Scanner;

/*
17. Write a Java program to convert a decimal number to binary number.
Input Data: Input a Decimal Number : 5 Expected Output Binary number is: 101
 */
public class Program17 {
    static int x;
    public static void main(String[] args) {
        convertToBin();
    }
    public static void convertToBin(){
        Scanner y = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        x = y.nextInt();
        System.out.println("Output Binary number : " + Integer.toBinaryString(x));
        y.close();
    }
}
