package nirosha.WhileLooping;

import java.util.Scanner;

public class NEvenNum {
    public  void Printeven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("print the starting number");
       // int count= sc.nextInt();
        System.out.println("print the n number");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
           /* if (i % 2 == 0) {
                //System.out.println("print the numbers" + count);
            }count++;*/
            System.out.println("print the number" + i*2);
        }
    }
    public static void main(String[] args){
        NEvenNum NE = new NEvenNum();
        NE.Printeven();
    }
}
