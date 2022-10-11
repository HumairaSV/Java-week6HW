package javaweek6_humaira;

import java.util.Scanner;

/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data: Input first number: 125 Input second number: 24
Expected Output : 125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Program18 {
    static int x;
    static int y;

    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.print("Input first number: ");
        x = first.nextInt();
        System.out.print("Input second number: ");
        y = first.nextInt();
        Program18 program18 = new Program18();
        program18.mod();
        first.close();


    }
    public static void add(){
        System.out.println(x + "+" +y +" = " + (x + y) );
    }
    public void sub(){
        add();
        System.out.println(x + "-" +y +" = " +(x-y));
    }
    public static void multi(){
        Program18 ab = new Program18();
        ab.sub();
        System.out.println(x + "x" +y +" = " +(x*y));
    }
    public static void div(){
        multi();
        System.out.println(x + "/" +y +" = " +(x/y));
    }
    public void mod(){
        div();
        System.out.println(x + " mod " +y +" = " +(x%y));
    }
}
