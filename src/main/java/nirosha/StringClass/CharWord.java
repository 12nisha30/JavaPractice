package nirosha.StringClass;

public class CharWord {
    public static void main(String[] args){
        System.out.println("To Count The NUmber Of Characters In a  String");
        String a = "Java is Super";
        System.out.println("Print the length:" +a.length());
        // Another Program
        System.out.println("To Count The NUmber Of Words In a  String");
        String[] b =a.split(" ");
        System.out.println("print the Split Array " +b);
        System.out.println("Print the length:" +b.length);
        for (String c:b) {
            System.out.println("Print the length:" +c.length());
        }
    }
}
