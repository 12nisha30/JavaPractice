package nirosha.SingleDArrays;

public class Reverse {
    public static void main(String[] args){
        System.out.println("Print the Reverse of an Array ");
        boolean[] i= new boolean[]{false,true,false,false,true,true};
        boolean[] k=new boolean[i.length];
        for (int j=i.length;j>0;j--){
            k[i.length-j]=i[j-1];
        }
        for (int j=0;j<k.length;j++){
           System.out.println("print the reverse output:"+k[j]);
        }
    }
}
