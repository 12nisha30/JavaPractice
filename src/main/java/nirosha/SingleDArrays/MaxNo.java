package nirosha.SingleDArrays;

public class MaxNo {
    public static void main(String[] args){
        System.out.println("Print the Maximum Number and Index size");
        int[] a= new int[] {2,5,1,9,6};
        int max = a[0];
        int j=0 ;
        for( int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
                j = i;
            }
        }
        System.out.println("the maximum no is :"+max);
        System.out.println("the index no is :"+j);
    }
}
