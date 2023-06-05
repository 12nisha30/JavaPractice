package nirosha.StringClass;

import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args){
        System.out.println("To Count The Total Number of Occurrences Of a Given Character");
        String word = "Hello World";
        String[] c =word.split("");
        int count =0;
        for (String letter :c) {
            System.out.println(letter);
            if (letter.equals("l")){
                count++;}
        }
        System.out.println("the no of letter is:" +count);
        //Another Program
        System.out.println("count the letter given from input");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(a);
        String[] b = a.split("");
        String i = sc.nextLine();
        int size =0;
        for (String array:b) {
            System.out.println(array);
            if (array.equalsIgnoreCase(i))
                size++;
        }
        System.out.println("\n" +"the no of letter is:" +size);
    }

}
