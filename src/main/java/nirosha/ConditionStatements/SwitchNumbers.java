package nirosha.ConditionStatements;

import java.util.Scanner;

public class SwitchNumbers {
    public static void main(String[] args){
        System.out.println("Program about the Numbers are Even or Odd using Switch Condition ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
       // int k = (i%2);
        switch(i%2){
            case 0:
                System.out.println("The Given Number is Even");
                break;
            default:
                System.out.println("The Given Number is Odd ");
        }
    }
}
