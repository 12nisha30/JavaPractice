package nirosha.Practice;
import java.lang.System;
public class Addition {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 70;
        Addition Add= new Addition();
        int x = Add.addition(a, b);
        ChildMethod CM = new ChildMethod();
        int y = CM.addition(a, b, c);
        System.out.println(+x);
        System.out.println(+y);
    }

    public int addition (int a, int b) {
        int x = a+b;
        return x;
    }

}

