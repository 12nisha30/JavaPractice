package nirosha.StringClass;

public class OddEven {
    public static void main(String[] args){
        System.out.println("Change Odd words to Uppercase and Reverse the Even words");
        String sentence= "This is a test String";
        String[] pattern = sentence.split(" ");
       String[] reverse= new String[pattern.length];
        for(int i=0;i< pattern.length;i++){
            if (i%2==0){
             reverse[i]=pattern[i].toUpperCase();
            }
            else {
                String[] letter=pattern[i].split("");
                String reverse1= "";
                for (int j= letter.length-1;j>=0;j--){
                    reverse1+=letter[j];
                }
               reverse[i]=reverse1;
            }
        }
        for(String k:reverse){
            System.out.print(k);
        }
        second();

    }

    public static void second(){
        System.out.println("Change Odd words to Uppercase and Reverse the Even words");
        String sentence= "This is a test String";
        String[] pattern = sentence.split(" ");
        String[] reverse= new String[pattern.length];
        String second = "";
        for(int i=0;i< pattern.length;i++){
            if (i%2==0){
                second+=pattern[i].toUpperCase();
            }
            else {
                String[] letter=pattern[i].split("");
                String reverse1= "";
                for (int j= letter.length-1;j>=0;j--){
                    reverse1+=letter[j];
                }
                second+=reverse1;
            }
        }
        System.out.println(second);

    }

}
