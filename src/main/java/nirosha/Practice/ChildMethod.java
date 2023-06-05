package nirosha.Practice;

public class ChildMethod extends Addition {
    int i= 70;
    int j= 20;
   public void Printnothing(){
       System.out.println("Add:" +(i+j));
       System.out.println("Mul=" +(i*j));
       System.out.println("Div=" +(i/j));
       System.out.println("Sub=" +(i-j));
   }
    public int addition (int a, int b, int c) {
        int x = a+b*c;
        return x;
    }
}
