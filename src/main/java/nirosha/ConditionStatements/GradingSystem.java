package nirosha.ConditionStatements;
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args){
        System.out.println("Numbers using relational Operators");
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        if (result<35)
        {
            System.out.println("The Student is Failed");
        }
        else {
            System.out.println("The Student is Passed");
            if (result >=90){
                System.out.println("The Student Passes with 'A' Grade");
            }
            else if (result >= 75) {
                System.out.println("The Student Passes with 'B' Grade");
            }
            else if  (result >=35){
                System.out.println("The Student Passes with 'C ' Grade");
            }
        }
    }
}
