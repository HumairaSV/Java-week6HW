package javaweek6_humaira;
/*
3. Write a Java programme using the following steps.
    3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {
    String beta = "Sky is the limit";
    static float a = 1.55f;

    public static void main(String[] args) {
        Program3 tab = new Program3();
        tab.methodThree();
        methodFour();
    }
    public void methodThree(){
        System.out.println(beta);
        System.out.println(a);
        System.out.println(Program3.a);
    }
    private static void methodFour(){
        Program3 p = new Program3();
        System.out.println(a);
        System.out.println(p.beta);
    }
}
