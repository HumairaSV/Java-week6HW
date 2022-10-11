package javaweek6_humaira;

import java.util.Scanner;

/*
13. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
public class Program13 {
    int a;
    int b;
    int c;

    public static void main(String[] args) {
        averageNos();

    }
    public static void averageNos(){
        System.out.println("--------------------");
        System.out.println("Average Function");
        System.out.println("--------------------");
        Program13 program13 = new Program13();
        Scanner nos = new Scanner(System.in);
        System.out.print("Enter first no:");
        program13.a = nos.nextInt();
        System.out.print("Enter second no:");
        program13.b = nos.nextInt();
        System.out.print("Enter third no:");
        program13.c = nos.nextInt();
        System.out.println("Average: " + (program13.a + program13.b + program13.c)/3);
        nos.close();
    }
}
