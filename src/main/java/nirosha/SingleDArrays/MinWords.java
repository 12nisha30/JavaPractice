package nirosha.SingleDArrays;

public class MinWords {
    public static void main(String[] args){
        System.out.println("Print the Minimum Word and Index size");
       String[] a= new String[]{"Coffee","Water","Chai","Diet-Coke"};
        String str = a[0];
        int len1 = a[0].length();
        int len2 = 0;
        int j=0;
        String min= "";
        for( int i = 1; i < a.length; i++) {
            str = a[i];
            len2 = str.length();
            if (len1 > len2) {
                len1 = len2;
                min = str;
                j=i;
            }
        }
            System.out.println("the MiniMum word is :"+min+  "-and index size is:"+j);
    }
}
