package nirosha.ForLoop;

public class ForLoop2 {
    public static void main(String[] args){
        System.out.println("Print the Numbers which are Divisible by 7 using For Loop");
        int i;
        for (i=2;i<100;i++){
            if (i%7==0){
                System.out.println("The Output is:" +i);
            }
        }
    }
}
