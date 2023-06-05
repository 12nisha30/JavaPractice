package nirosha.ConditionStatements;
import java.util.Scanner;
public class Conditions {
    public static void main(String[] args){
        System.out.println("Numbers using Condition Statements");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i%2 ==0)
        {
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The Number is Odd");
        }
        System.out.println("cheking about years");

        int j = sc.nextInt();

        if (j%4==0)
        {
            System.out.println("The Year is Leap Year");
        }
        else {
            System.out.println("The Year is Non-Leap Year");
        }
    }
}
