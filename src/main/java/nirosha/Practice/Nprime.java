package nirosha.Practice;

import java.util.Scanner;

public class Nprime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("print the n Number");
        int n = sc.nextInt();
        int i=1;
        int j;
        int count;
        while(i<=n) {
            count = 0;
            j=2;
            while ( j <=i / 2) {
                if (i % j == 0) {
                    count++;
                    break;
                }
                j++;
            }
            if (count == 0 && i!= 1) {
                System.out.println("print the prime number is:" + i);
            }
            i++;
        }
    }
}
