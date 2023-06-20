package nirosha.GitPractice;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [] nums = new int[5];
        System.out.println("give the list of numbers");
        for (int i=0; i< nums.length;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("give the total sum number");
        int target = sc.nextInt();
        for (int i=0;i< nums.length;i++) {
            for (int j = 1; j < nums.length; j++) {
               if( nums[i] + nums[j] ==target){
                   System.out.println("the indcies are:["+i+","+j+"]");
                   return;
               }
            }
        }
    }
}
