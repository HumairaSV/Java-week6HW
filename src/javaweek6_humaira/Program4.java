package javaweek6_humaira;
/*
4. Write a Java programme using the following steps.
    4.1 Declare two instance and two static variables.
    4.2 Declare one instance method.
    4.3 Declare one static method.
    4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    4.5 Declare the Main method.
    4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    long ab = 7890012;
    char r = 'y';
    static int c = 12;
    static String d = "Practice makes Perfect";

    public static void main(String[] args){
        Program4 obj = new Program4();
        obj.checkMethodOne();
        checkMethodTwo();
    }

    public void checkMethodOne(){
        System.out.println(ab);
        System.out.println(r);
        System.out.println(Program4.c);
        System.out.println(d);
    }
    public static void checkMethodTwo(){
        Program4 bc = new Program4();
        System.out.println(bc.ab);
        System.out.println(bc.r);
        System.out.println(c);
        System.out.println(d);
    }
}
