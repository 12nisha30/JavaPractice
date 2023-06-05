package nirosha.Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("give the 'n' number in this series");
        int n= sc.nextInt();
        int[] a = new int[n];
        System.out.println("give the first series number");
        int n1 = sc.nextInt();
        System.out.println("give the Second series number");
        int n2 = sc.nextInt();
        a[0] = n1;
        a[1] = n2;
        for (int i=2;i<n;i++) {
            a[i] = a[i-2] + a[i-1];
        }
        System.out.println("the 'n' no of fibonacci series is:");
        for (int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

/*
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        System.out.println(); */
    }
}
