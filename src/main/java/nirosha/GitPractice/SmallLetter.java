package nirosha.GitPractice;
import java.util.Arrays;
import java.util.Scanner;

public class SmallLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        String[] input = {"d", "g", "i", "k", "n"};
        int k=0 ;
        int j=0;
        String target = sc.nextLine();
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                k =i + 1;
                break;
            }
        }
        for (int i=k;i<data.length;i++){
            for (j=0;j<input.length;j++){
                if (data[i]==input[j]){
                    System.out.println(input[j]);
                    return;
                }
                else {
                    System.out.println(input[0]);
                    return;
                }
            }
        }
    }
}
