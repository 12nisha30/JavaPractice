package nirosha.Practice;

public class Math {
    public static void main(String[] args) {
        int i = 30;
        int j = 10;
        main2(i,j);
        main3(i,j);
        main4(i,j);
        main5(i,j);
    }
    public static void main2(int i,int j){
         int k = i+j;
        System.out.println("the value of addition:" +k );
    }
    public static void main3(int i,int j){
        int k = i-j;
        System.out.println("the value of Subtraction:" +k );
    }
    public static void main4(int i,int j) {
        int k = i * j;
        System.out.println("the value of Multipication:" + k);
    }
    public static void main5(int i,int j) {
        int k = i / j;
        System.out.println("the value of Division:" + k);
    }
}

