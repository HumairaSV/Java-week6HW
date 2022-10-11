package javaweek6_humaira;

import java.util.Scanner;

/*
5. Write a program for a calculator with addition, subtraction, multiplication and division methods
all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {
    static double number1;
    static double number2;
    static char operator;

    public static void main(String[] args) {
        Program5 program5 = new Program5();
        System.out.println("----------------------------");
        System.out.println("This is a Simple Calculator");
        System.out.println("----------------------------");
        System.out.println("Please choose one of the below options");
        System.out.println("Enter + for addition");
        System.out.println("Enter - for subtraction");
        System.out.println("Enter * for multiplication");
        System.out.println("Enter / for division");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = sc.nextDouble();
        System.out.print("Please select function you want to carry out:");
        operator = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        number2 = sc.nextDouble();

        if (operator == '+') {
            addition();
        }
        if (operator == '-') {
            substraction();
        }
        if (operator == '*') {
            program5.multiplication();
        }
        if (operator == '/') {
            program5.division();
        }

        if (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
            System.out.println("This is an invalid entry. Please use + or - or * or /");
            sc.close();
        }
    }

    public static void addition() {
        System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
    }

    public static void substraction() {
        System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
    }

    public void multiplication() {

        System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
    }

    public void division() {
        System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
    }
}

