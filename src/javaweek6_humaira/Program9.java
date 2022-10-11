package javaweek6_humaira;
/*
9. Write a program to convert the upper case to lower case.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        upperToLower();
    }
    public static void upperToLower() {
        String first;
        System.out.println("-------------------------");
        System.out.println("Upper case to Lower case");
        System.out.println("-------------------------");
        Scanner up = new Scanner(System.in);
        System.out.print("Enter sentence in Upper case: ");
        first = up.nextLine();
        System.out.println("Output in Lower case: " + first.toLowerCase());
        up.close();

    }
}
