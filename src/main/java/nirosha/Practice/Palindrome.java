package nirosha.Practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine().replaceAll(" ","");
        String  reverse ="";
        for(int i=name.length()-1;i>=0;i--){
            reverse= reverse+name.charAt(i);
        }
        System.out.println(reverse);
        if(name.equalsIgnoreCase(reverse)){
            System.out.println("This is a Palindrome ");
        }
        else
            System.out.println("this is not a palindrome");
    }
}
