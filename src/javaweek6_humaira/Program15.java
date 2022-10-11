package javaweek6_humaira;
/*
15. Write a Java program to swap two variables.
 */

public class Program15 {

    public static void main(String [] args){
        swapVariables();
    }
    public static void swapVariables(){
        int a = 5;
        int b = 9;
        System.out.println("Original values of a and b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a ^ b ^ (b = a);
        System.out.println("Swapped values of a and b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
