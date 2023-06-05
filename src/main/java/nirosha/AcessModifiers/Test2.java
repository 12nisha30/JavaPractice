package nirosha.AcessModifiers;

public class Test2 extends Test1{
@Override
    public void Method1(){
        System.out.println("Hello world1");
    }


    public static void main(String args[]){
        Test2 t2 = new Test2();
        t2.Method1();
    }
}
