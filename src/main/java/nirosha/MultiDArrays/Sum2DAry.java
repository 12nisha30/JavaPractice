package nirosha.MultiDArrays;

import java.util.Scanner;

public class Sum2DAry {
    public static void main(String[] args) {
        System.out.println("Create and ADD the Multi-Array using Dynamic method");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        System.out.println("Print the Matrix Value");
        int count=0;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                count= count+a[i][j];
            }
        }

        System.out.println("The Multi-Array Matrix is: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("The Sum of the Matrix is:" +count);
    }
}
