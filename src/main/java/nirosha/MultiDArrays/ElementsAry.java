package nirosha.MultiDArrays;

public class ElementsAry {
    public static void main(String[] args){
        System.out.println("Add the Elements in an Array");
        int[][] a = new int[][] {
                {1,2,1},
                {9,7,2},
                {7,6,4}
        };
        int[][] b = new int[][] {
                {2,6,8},
                {0,1,3},
                {1,2,4}
        };
        int[][] c= new int[3][3];

        for (int i=0;i<a.length;i++){
            for (int j=0;j< a.length;j++){
                int num1 = a[i][j]+b[i][j];
                c[i][j] = num1;
            }
        }
        System.out.println("The Element of the 'C' Matrix is:");
        for (int i=0;i<c.length;i++){
            for (int j= 0;j<c.length;j++){
                System.out.print(c[i][j] +" ");
            }
            System.out.println();
        }

    }
}
