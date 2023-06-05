package nirosha.MultiDArrays;

public class AddMultiArray {

        public static void main(String[] args) {
            int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
            int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};

            // Create the result matrix
            int[][] resultMatrix = new int[3][3];

            // Add the matrices element-wise
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    int sum = 0;
                    for(int k=0; k<2; k++) {
                        sum += matrix1[i][k] + matrix2[k][j];
                    }
                    resultMatrix[i][j] = sum;
                }
            }

            // Print the result matrix
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
