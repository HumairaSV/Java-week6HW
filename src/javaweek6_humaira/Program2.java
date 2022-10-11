package javaweek6_humaira;
/*
2. Write a Java programme using the following steps.
    2.1 Declare two static variables
    2.2 Declare one static method
    2.3 Call both static variables into the static method inside the print statement.
    2.4 Declare the Main method.
    2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {
    static String alpha = "Hello";
    static byte x = 2;

    public static void main(String[] args){
        methodTwo();

    }
    public static void methodTwo(){
        System.out.println(alpha);
        System.out.println(x);
    }
}
