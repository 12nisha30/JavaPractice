package nirosha.ConditionStatements;

import java.util.Scanner;

public class DaysSwitch {
    public static void main(String[] args){
        System.out.println("Program about the Days are WeekDay or WeekEnd using Switch Condition ");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        switch(i){
            case "sunday" :
            case "saturday":
                System.out.println("The Given Day is WeekEnd");
                break;
            default:
                System.out.println("The Given Day is WeekDay");
        }
    }
}
