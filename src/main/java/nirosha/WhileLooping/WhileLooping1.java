package nirosha.WhileLooping;

import java.util.Scanner;

public class WhileLooping1 {
    public static void main(String[] args){
       System.out.println("Print the Even Numbers Using While Looping");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();//200
        int j = sc.nextInt();//500
        while (i<=j){
          //System.out.println("Print the values:" +i);
          //i=i+2;
           int k = i%2;
               if(k==0){
               System.out.println("Print the values:" +i);
            }
           i++;
        }
    }
}
