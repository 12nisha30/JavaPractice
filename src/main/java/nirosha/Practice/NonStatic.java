package nirosha.Practice;

public class NonStatic {
        public static void main(String[] args) {
            int i = 30;
            int j = 10;
            NonStatic NS = new NonStatic();
            NS.addition(i,j);
            NS.Subtraction(i,j);
            NS.Multipication(i,j);
            NS.Division(i,j);
        }
        public void addition(int i,int j){
            int k = i+j;
            System.out.println("the value of addition:" +k );
        }
        public void Subtraction(int i,int j){
            int k = i-j;
            System.out.println("the value of Subtraction:" +k );
        }
        public  void Multipication(int i,int j) {
            int k = i * j;
            System.out.println("the value of Multipication:" + k);
        }
        public  void Division(int i,int j) {
            int k = i / j;
            System.out.println("the value of Division:" + k);
        }
    }



