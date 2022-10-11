package javaweek6_humaira;

import java.util.Scanner;

/*
20. Write a Java Program to print as below.
"+------------------------+"
"|                        |"
"| CORNER STORE           |"
"|                        |"
"| 2015-03-29 04:38PM     |"
"|                        |"
"| Gallons: 10.870        |"
"| Price/gallon: $ 2.089  |"
"|                        |"
"| Fuel total: $ 22.71    |"
"|                        |"
"+------------------------+"
 */
public class Program20 {
    double g;

    public static void main(String[] args) {
        Program20 pro = new Program20();
        Scanner gallon = new Scanner(System.in);
        System.out.print("Enter the Gallons of Fuel purchased: ");
        pro.g = gallon.nextDouble();
        pro.lineTwelve();
        gallon.close();
    }
    public void lineOne() {
        System.out.println("\"+------------------------+\"");
    }
    public static void lineTwo() {
        Program20 first = new Program20();
        first.lineOne();
        System.out.println("\"|                        |\"");
    }
    public void lineThree() {
        lineTwo();
        System.out.println("\"| CORNER STORE           |\"");
    }
    public static void lineFour() {
        Program20 second = new Program20();
        second.lineThree();
        System.out.println("\"|                        |\"");
    }
    public void lineFive() {
        lineFour();
        System.out.println("\"| 2015-03-29 04:38PM     |\"");
    }
    public void lineSix() {
        lineFive();
        System.out.println("\"|                        |\"");
    }
    public void lineSeven() {
        lineSix();
        System.out.println("\"| Gallons:      " + g + "    |\"");
    }
    public void lineEight() {
        lineSeven();
        System.out.println("\"| Price/gallon: $2.089   |\"");
    }
    public void lineNine() {
        lineEight();
        System.out.println("\"|                        |\"");
    }
    public void lineTen() {
        lineNine();
        double t = g * 2.089;
        System.out.printf("\"| Fuel total: $%6.2f    |\"", t);
        System.out.println("");
    }
    public void lineEleven() {
        lineTen();
        System.out.println("\"|                        |\"");
    }
    public void lineTwelve() {
        lineEleven();
        System.out.println("\"+------------------------+\"");
    }
}