package nirosha.MultiDArrays;

public class CommonElmnts {
    public static void main(String[] args){
        System.out.println("Print the Common Elements between the Array");
        int[][] a= new int[][]{
                {1,2,1},{9,7,2},{7,6,4}
        };
        int[][] b= new int[][]{
                {2,6,8,6},{0,1,3,9,7},{7,2,0},{8,3}
        };
        int[][] c= new int[b.length][b.length];
        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                if (b[i][j] == a[i][j])
                    c[i][j]=b[i][j];
                 System.out.println(c[i][j]);
            }
        }
    }
}
