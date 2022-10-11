package javaweek6_humaira;

/*
11. Write a Java program to display the following pattern.
Sample Pattern : J a v v a
                 J a a v v a a
                 J J aaaaa V V aaaaa
                 J J a  a V a  a
 */
public class Program11 {

    public static void main(String[] args) {
        patternCalld();
    }

    public void patternCalla() {
        System.out.println("J a v v a");
    }

    private void patternCallb() {
        patternCalla();
        System.out.println("J a a v v a a");
    }

    static void patternCallc() {
        Program11 obj = new Program11();
        obj.patternCallb();
        System.out.println("J J aaaaa V V aaaaa");
    }

    public static void patternCalld() {
        patternCallc();
        System.out.println("J J a  a V a  a");
    }
}
