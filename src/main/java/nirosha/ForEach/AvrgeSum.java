package nirosha.ForEach;

public class AvrgeSum {
    public static void main(String[] args) {
        System.out.println("Print the Sum of Array Integers Using ForEach Loop");
        int[] i = {2, 5, 1, 9, 6};
        int sum =0;
        for (int value:i) {
            sum +=value;
        }
        System.out.println(sum);
        System.out.println(sum/i.length);

        //Another Program
        System.out.println("Print the maximum Number of the array");
        int max= i[0];
        for (int value: i) {
            if (value> max)
                max =value;
        }
        System.out.println("Print the Maximum no:" +max);
    }
}
