package nirosha.Dcoding;

public class Cars extends Vehicles{
    public void Drive(){
        System.out.println("Repairing a Car");
    }
    public static void main(String[] args){
        Cars cs = new Cars();
        cs.Drive();
        cs.Brand();
    }
}
