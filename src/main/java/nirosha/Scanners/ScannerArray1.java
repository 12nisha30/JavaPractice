package nirosha.Scanners;

import java.util.Scanner;

public class ScannerArray1 {
    public static void main(String[] args){
        System.out.println("Check the number is present in the Element Array");
        Scanner sc = new Scanner(System.in);
        int[] a= new int[5];
        for (int i=0; i<a.length;i++){
            System.out.println("Input the Values of a");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            System.out.println("Print the values 0f a array:" +a[i]);
        }
        for (int i=0; i<a.length;i++){
            int j=sc.nextInt();
            if (a[i]==j)
                System.out.println("The number is present");
            else
                System.out.println("The number is Not Present");
        }
    }
}
