package nirosha.MultiDArrays;

public class ConditionAry {
    public static void main(String[] args){
        System.out.println("Create an Array using Conditions Statement");
        int[][] a= new int[][]{{1,2,1},{9,7,2},{7,6,4}};
        int[][] b= new int[][]{{1,6,1},{0,7,3},{1,6,4}};
        int[][] c =new int[a.length][a.length];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]==b[i][j])
                    c[i][j]=1;
                else
                    c[i][j]=0;
            }
        }
        for (int i=0;i<c.length;i++){
            for (int j=0;j<c[i].length;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
