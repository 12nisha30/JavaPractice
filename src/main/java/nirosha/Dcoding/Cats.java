package nirosha.Dcoding;

public class Cats extends Animals {
    public void makeSound(){
        System.out.println("Its Sounds like Bark");
    }

    public static void main(String[] args){
        Cats c= new Cats();
        c.makeSound();
    }
}
