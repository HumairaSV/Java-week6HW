package javaweek6_humaira;
/*
8. Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Program8 {

    public static void main(String[] args) {
        areaTriangle();


    }
    public static void areaTriangle(){
        System.out.println("--------------------");
        System.out.println("Area of Triangle");
        System.out.println("--------------------");
        //Area=  0.5 * b * h
        double b;
        double h;
        Scanner area = new Scanner(System.in);
        System.out.print("Enter base:");
        b = area.nextDouble();
        System.out.print("Enter height:");
        h = area.nextDouble();
        System.out.println("Area:" + 0.5*b*h);
        area.close();
    }
}
