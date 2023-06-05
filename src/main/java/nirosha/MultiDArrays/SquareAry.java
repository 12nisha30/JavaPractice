package nirosha.MultiDArrays;

import java.util.Scanner;

public class SquareAry {
    public static void main(String[] args){
        System.out.println("Create and Square the Matrix Array by using Scanner method");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];
        int[][] square= new int[a.length][a.length];
        System.out.println("Print the Matrix Value");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                square[i][j]= a[i][j]*a[i][j];
            }
        }
        System.out.println("Print the Square matrix"+square.length);
        for (int i=0;i<square.length;i++){

            for (int j=0;j<square[i].length;j++){

                System.out.print(square[i][j] +" ");
            }
            System.out.println();
        }
    }
}
