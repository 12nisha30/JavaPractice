package nirosha.Scanners;

import java.util.Scanner;

public class ScannerArray2 {
    public static void main(String[] args){
        System.out.println("find the positive,negative,zeros,even or odd numbers");
        Scanner sc = new Scanner(System.in);
        int[] a= new int[20];
        int positive = a[0];
        int negative = a[0];
        int zero = a[0];
        int even = a[0];
        int odd = a[0];
        for (int i=0; i<a.length;i++){
            System.out.println("Input the Values of a");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<a.length;i++){
            if (a[i]>0)
                positive++;
            else if (a[i]<0)
                negative++;
            else
                zero++;
            if (a[i]%2 == 0)
                even++;
            else
                odd++;
            System.out.println("Print the values 0f a array:" +a[i]);
        }
        System.out.println("The Positive Numbers are :" +positive);
        System.out.println("The Negative Numbers are :" +negative);
        System.out.println("The Zeros Numbers are :" +zero);
        System.out.println("The Even Numbers are : " +even);
        System.out.println("The Odd Numbers are :" +odd);
    }
}
