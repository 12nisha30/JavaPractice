package nirosha.MultiDArrays;

import java.util.Scanner;

public class Create2DArray {
    public static void main(String[] args){
        System.out.println("Create the 2-D Array using Dynamic/Scanner method");
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] a= new int[m][n];
        System.out.println("Print the Matrix Value");
       // int count = sc.nextInt();
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
                //     OR
               // a[i][j]=count;
                //count++;
            }
        }

        System.out.println("The 2-D Array Matrix is: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
