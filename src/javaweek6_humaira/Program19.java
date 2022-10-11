package javaweek6_humaira;

import java.util.Scanner;

/*
19. Write a Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG. Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19 {

    public static void main(String[] args) {
        upToLow();

    }
    public static void upToLow(){
        String lower;
        System.out.println("------------------------------");
        System.out.println("Convert Uppercase to Lowercase");
        System.out.println("------------------------------");
        Scanner lo = new Scanner(System.in);
        System.out.print("Enter a sentence in Uppercase: ");
        lower = lo.nextLine();
        System.out.println("Output in Lowercase: " + lower.toLowerCase());
        lo.close();

    }
}
