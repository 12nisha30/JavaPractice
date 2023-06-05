package nirosha.Scanners;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        System.out.println("Print the Integers in Reverse order");
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[a.length];
        for (int i=0;i<a.length;i++){
            System.out.println("Input the Integers of a:");
            int x = sc.nextInt();
            if (x>0) {
                System.out.println("The Elements in a are:" +x);
                a[i]=x;
            }else
                System.out.println("The Element has error ");
        }
        for (int j =a.length; j>0;j--){
            b[a.length-j]=a[j-1];
        }
        System.out.println("The Reverse order in array are:");
        for (int j=0;j<b.length;j++){
            System.out.println("The Elements in b are:" +b[j]);
        }
    }
}
