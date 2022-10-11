package javaweek6_humaira;
/*
1. Write a Java programme using the following steps.
    1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {
    int a = 13;
    String bot = "lucky";

    public static void main(String[] args){
        Program1 obj = new Program1();
        obj.methodOne();
    }

    public void methodOne(){
        System.out.println(a);
        System.out.println(bot);
    }
}
