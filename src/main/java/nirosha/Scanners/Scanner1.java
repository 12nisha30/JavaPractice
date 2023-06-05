package nirosha.Scanners;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args){
        System.out.println("This is Addition:");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int sum= num1+num2;
        System.out.println("Addition of 2 numbers:" +sum);
        //another program
        System.out.println("Name the Family Numbers");
        String myName = sc.next();
        String myHusbandName = sc.next();
        String mySonName = sc.next();
        System.out.println("This is My Family");
    }
}
