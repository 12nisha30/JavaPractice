package nirosha.GitPractice;

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("give the nth Number");
        int a = sc.nextInt();
        int i=1;
        int n= sc.nextInt();
        int count =0;
        int j;
        int number;
        while(count<a){
          while(i<n) {
              number = 0;
              for (j = 2; j <= i / 2; j++) {
                  if (i % j == 0) {
                      number++;
                      break;
                  }
              }
                  if (count == a) {
                      System.out.println("the n th number is:" + i);
                  }
              i++;
          }count++;
        }

    }


}
