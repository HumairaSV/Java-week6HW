package javaweek6_humaira;

import java.util.Scanner;

/*
7. Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
((F − 32) × 5/9 = 0°C).
 */
public class Program7 {

    public static void main(String[] args) {
        Program7 program7 = new Program7();
        program7.temperatureConverter();
    }
    public void temperatureConverter(){
        double f;
        System.out.println("---------------------------");
        System.out.println("Fahrenheit to Celsius Converter");
        System.out.println("---------------------------");
        Scanner temp = new Scanner(System.in);
        System.out.print("Temperature in Fahrenheit:");
        f = temp.nextInt();
        System.out.println("Temperature in Celsius   :" + ((f-32) * 5/9));
        temp.close();
    }
}
