package nirosha.ConditionStatements;
import java.util.Scanner;
public class DaysSystem {
    public static void main(String[] args){
        System.out.println("Days using Logical Operators");
        Scanner sc = new Scanner(System.in);
        String days= sc.nextLine();
        if (days == "monday"|| days =="tuesday"|| days =="wednesday"|| days =="thursday"|| days =="friday")
        {
            System.out.println("The Day is WeekDay");
        }
        else
        {
            System.out.println("The Days is WeekEnd");
        }
    }
}
