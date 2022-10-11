package javaweek6_humaira;

import java.util.Scanner;

/*
10. Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data: Input a number: 8 Expected Output : 8 x 1 = 8 8 x 2 = 16 8 x 3 = 24 ... 8 x 10 = 80

 */
public class Program10 {
    public static void main(String[] args) {
        multiplicationMethod();
    }
    public static void multiplicationMethod(){
        int a;
        System.out.println("--------------------------");
        System.out.println("Multiplication Table");
        System.out.println("--------------------------");
        Scanner multi = new Scanner(System.in);
        System.out.print("Enter the number you want the multiplication table for:");
        a = multi.nextInt();
        System.out.println(a + " x 1 = " + a*1);
        System.out.println(a + " x 2 = " + a*2);
        System.out.println(a + " x 3 = " + a*3);
        System.out.println(a + " x 4 = " + a*4);
        System.out.println(a + " x 5 = " + a*5);
        System.out.println(a + " x 6 = " + a*6);
        System.out.println(a + " x 7 = " + a*7);
        System.out.println(a + " x 8 = " + a*8);
        System.out.println(a + " x 9 = " + a*9);
        System.out.println(a + " x 10 = " + a*10);
        multi.close();

    }
}
