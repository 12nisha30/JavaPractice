package nirosha.SingleDArrays;

public class SumArray {
    public static void main(String[] args){
        System.out.println("Print the Sum of Array Integers");
        int[] i= {2,5,1,9,6};
        int count = 0;
        for (int j=0; j<i.length; j++){
            count = count + i[j];
        }
        System.out.println("print the Output:" +count);
    }
}
