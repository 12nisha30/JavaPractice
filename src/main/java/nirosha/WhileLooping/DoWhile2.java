package nirosha.WhileLooping;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args){
        System.out.println("Print the Sum of Even Numbers Using Do-While Looping");
        Scanner sc= new Scanner(System.in);
        int count=0;
        int i = sc.nextInt();//40
        int j = sc.nextInt();//80
      do {
            if(i%2==0){
                count = count+i;
                System.out.println("Print the values:" +count);
            }
            i++;
        } while (i<=j);
       // System.out.println("Print the values:" +count);

    }
}
