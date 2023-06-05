package nirosha.WhileLooping;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        System.out.println(" Print the Prime Numbers 50 to 150  using Do-While Looping Conditions");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();//50
        int j = sc.nextInt();//150
        int PrimeCheckNumber;
        int count;
        do {
            count=0;
            PrimeCheckNumber=2;
            while (PrimeCheckNumber <= i/2)
            {
                if(i % PrimeCheckNumber == 0)
                {
                    count++;
                    break;
                }
                PrimeCheckNumber++;
            }
            if (count == 0 && i != 1)
            {

                System.out.println("Print the values:" +i);
            }
            i++;
        }while (i <= j);
       /* int primeCheckNumber;
        int n = 50;
        int divisibleCount;

        while (n <= 150) {
            divisibleCount = 0;
            primeCheckNumber = 2;
            while (primeCheckNumber <= n / 2) {
                if (n % primeCheckNumber == 0) {
                    divisibleCount++;
                    break;
                }
                primeCheckNumber++;
            }
            if (divisibleCount == 0 && n != 1) {
                System.out.print(n + " ");
            }
            n++;
        }*/

    }

}
