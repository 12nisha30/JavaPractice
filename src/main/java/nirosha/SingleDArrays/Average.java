package nirosha.SingleDArrays;

public class Average {
    public static void main(String[] args){
        System.out.println("Print the Average of Array Integers");
        int[] i= {2,5,3,9,6};
        int count = 0;
        for (int j=0; j<i.length; j++){
            count = count + i[j];
        }
        int k= (count/i.length);
        System.out.println("print the Output:" +k);
    }
}
