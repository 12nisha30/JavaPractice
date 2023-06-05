package nirosha.ForEach;

public class MultiAry {
    public static void main(String[] args){
        System.out.println("SUM and AVERAGE the multi array using ForEach Loop");
        int[][] a= new int[][]{
                {1,8,4},{9,7,2},{7,6,4} };
        int sum=0;
        int noOfElements=0;
        for (int[] SingleAry:a) {
            for (int b:SingleAry) {
                sum +=b;
                noOfElements++;
            }
        }
        System.out.println("Print the Sum of the Multi Ary:" + sum);
        System.out.println("Print the elements in Array is:" +noOfElements +"\n Average is:" +sum/noOfElements);
    }
}
