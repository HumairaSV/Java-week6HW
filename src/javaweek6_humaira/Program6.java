package javaweek6_humaira;

import java.util.Scanner;

/*
6. Write a program to enter any radius value of the circle and find out the area.
(Formula of Area A=PI*r*r).
 */
public class Program6 {

    public static void main(String[] args) {
        Program6 program6 = new Program6();
        program6.circle();
    }

    public void circle() {
        double r;
        System.out.println("--------------------");
        System.out.println("Area of Circle");
        System.out.println("--------------------");
        Scanner ci = new Scanner(System.in);
        System.out.print("Enter radius:");
        r = ci.nextDouble();
        System.out.println("Area: " + (3.14 * r * r));
        ci.close();

    }
}

