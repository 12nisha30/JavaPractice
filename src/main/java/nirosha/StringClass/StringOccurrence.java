package nirosha.StringClass;

import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the String ");
        String name = sc.nextLine();
        System.out.println("Give the Character in the given string");
        char c = sc.nextLine().charAt(0);
        int count =0;
        for(int i=0; i< name.length();i++){
            if(name.charAt(i) == c){
                count++;
            }
        }
        System.out.println("The character is" + " " +c+ ":" +count);
    }
}
