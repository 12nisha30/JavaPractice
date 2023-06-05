package nirosha.StringClass;

public class ReverseString {
    public static void main(String[] args){
        System.out.println("Output to Reverse a String");
        String word = "is";
        String[] letter=word.split("");
        String reverse= "";
        for (int i= letter.length-1;i>=0;i--){
            reverse+=letter[i];
        }
        System.out.println("Reversed string is : " + reverse);

// another program
        System.out.println("Output the reverse string with in the String");
      String[] withInR = word.split(" ");
      String backWord = "";
        for (int i=0; i<withInR.length;i++){
            String revWord= withInR[i];
            String back= "";
            for (int j=revWord.length()-1;j>=0;j--){
                back += revWord.charAt(j);
            }
            backWord += back+" ";
        }
        System.out.println("Reversed string is : " +backWord);
    }
}
