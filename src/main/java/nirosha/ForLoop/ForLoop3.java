package nirosha.ForLoop;

public class ForLoop3 {
    public static void main(String[] args){
       // System.out.println("Print the Sum of Even Numbers Using For Loop");
      //  int i;
        int count = 0;
       /* for (i=20; i<80; i++){
            if (i%2==0){
                count = count +i;
                System.out.println("The Output is:" +count);
            }
        }
        System.out.println("The no of loops executed "+i+" times");
        */

        int j;
        System.out.println("Print the Sum of Odd Numbers Using For Loop");
        for (j=1;j<50;j++){
            if (j%2==1){
                count = count+j;
                System.out.println("The Output is:" +count);
            }
        }
        System.out.println("The no of loops executed "+j+" times");
    }
}
