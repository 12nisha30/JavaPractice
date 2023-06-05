package nirosha.WhileLooping;

import java.util.Scanner;

public class WhileLooping2 {
    public static void main(String[] args){
        System.out.println("Print the Numbers which are Divisible by 7 using Looping Condition");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//150
        int b = sc.nextInt();//200
        while (a<=b){
            if(a%7==0){
                System.out.println("The given Output Number is:" +a);
            }
            a++;
        }
    }
}
