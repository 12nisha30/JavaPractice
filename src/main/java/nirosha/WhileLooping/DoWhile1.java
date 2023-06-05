package nirosha.WhileLooping;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args){
        System.out.println("Print the  reverse Odd Numbers Using Do-While Looping");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();//200
        int j = sc.nextInt();//25
        while (i>=j){
            int k = i%2;
            if(k==1){
                System.out.println("Print the values:" +i);
            }
            i--;
        }
    }
}
