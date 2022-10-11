package javaweek6_humaira;
/*
14. Write a Java program to print the area and perimeter of a rectangle.
Test Data: Width = 5.5 Height = 8.5 Expected Output: Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {
    float w = 5.6f;
    float h = 8.5f;

    public static void main(String[] args) {
        Program14 program14 = new Program14();
        program14.rectangleAreaPeri();
    }
    public void rectangleAreaPeri(){
        System.out.println("Area is 5.6 * 8.5 = " + w * h );
        System.out.println("Perimeter is 2* (5.6 + 8.5) = " + 2*(w+h));
    }

}
