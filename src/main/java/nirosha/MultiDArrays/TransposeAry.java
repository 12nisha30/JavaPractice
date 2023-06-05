package nirosha.MultiDArrays;

import java.util.Scanner;

public class TransposeAry {
    public static void main(String[] args){
        System.out.println("Input the Matrix Values");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] b= new int[a.length][a.length];
        System.out.println("Print the Matrix Value");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Multi-Array Transpose Matrix is: ");
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                b[i][j]=a[j][i];
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
