package nirosha.Scanners;

import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args){
        System.out.println("Store the Elements into an Array using Scanner method");
        Scanner sc= new Scanner(System.in);
        int[] a= new int[10];
        for (int i=0; i<a.length;i++){
            System.out.println("Input the Values of a");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.println("Print the values 0f a array:" +a[i]);
        }
    }
}
