package nirosha.WhileLooping;

import java.util.Scanner;

public class WhileLooping {
    public static void main(String[] args){
        System.out.println(" 1 to 100 numbers using Looping Conditions");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();//0
        int j = sc.nextInt();//100
        while (i<= j){
            System.out.println("Print the values:" +i);
            i++;
        }
    }
}
