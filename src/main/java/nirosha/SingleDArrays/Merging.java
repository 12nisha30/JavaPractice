package nirosha.SingleDArrays;

public class Merging {
    public static void main(String[] args) {
        System.out.println("Merge The Two Arrays");
        String[] i = new String[]{"Chai", "Coffee"};
        String[] j = new String[]{"Milk", "Water", "Coke"};
        String[] a = new String[i.length + j.length];
        int inc = 0;
        for (int k = 0; k < i.length; k++) {
            a[k] = i[k];
            inc++;
        }
        System.out.println("output:" +inc);
        for (int k = 0; k < j.length; k++) {
            a[k+inc] = j[k];
        }
        for (int b=0; b<a.length; b++){
            System.out.println("Output:" +a[b]);
        }
    }
}