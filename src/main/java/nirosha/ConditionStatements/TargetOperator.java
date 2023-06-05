package nirosha.ConditionStatements;

import java.util.Scanner;

public class TargetOperator {
    public static void main(String[] args){
        System.out.println("Program about the Arithmetic Numbers  using Switch Condition ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(); // any numbers can be given
        int j = sc.nextInt();
        String k = sc.next();
        switch (k){
            case "+" :
                System.out.println("The Output is:" +(i+j));
                break;
            case "-" :
                System.out.println("The Output is:" +(i-j));
                break;
            case "*" :
                System.out.println("The Output is:" +(i*j));
                break;
            case "/" :
                System.out.println("The Output is:" +(i/j));
                break;
            case "%" :
                System.out.println("The Output is:" +(i%j));
                break;
            default:
                System.out.println("we can't define the Output");
        }
    }
}
