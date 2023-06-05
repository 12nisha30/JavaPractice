package nirosha.Practice;

public class MainMethod {
    public void Printsomething(){
        System.out.println("these are the methods of maths");

    }

    public static void main(String[] args){
         MainMethod MM = new MainMethod();
         MM.Printsomething();
         ChildMethod CM = new ChildMethod();
         CM.Printnothing();

    }
}
