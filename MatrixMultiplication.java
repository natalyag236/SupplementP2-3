/**
 * The MatrixMultiplication class provides a method for performing matrix multiplication
 * and a demonstration of its functionality in the main method.
 */
public class MatrixMultiplication {

    /**
     * Multiplies two matrices m1 and m2 and stores the result in the res matrix.
     * 
     * @param m1 The first matrix (2D array) to be multiplied.
     * @param m2 The second matrix (2D array) to be multiplied.
     * @param res The resultant matrix (2D array) where the multiplication result is stored.
     * 
     * @throws IllegalArgumentException If the number of columns in m1 does not match the number of rows in m2.
     */
    public static void mulMat(int[][] m1, int[][] m2, int[][] res) {
        int r1 = m1.length;  
        int c1 = m1[0].length;  
        int r2 = m2.length; 
        int c2 = m2[0].length;  

        if (c1 != r2) {
            System.out.println("Invalid Input: Matrices cannot be multiplied due to incompatible dimensions.");
            System.exit(1);  
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                res[i][j] = 0; 
                for (int k = 0; k < c1; k++) {
                    res[i][j] += m1[i][k] * m2[k][j]; 
                }
            }
        }
    }

    /**
     * Main method that demonstrates matrix multiplication with two sample matrices.
     * It multiplies two matrices and prints the result to the console.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[][] m1 = {
            {1, 1},
            {2, 2}
        };

        int[][] m2 = {
            {1, 1},
            {2, 2}
        };

        int r1 = m1.length;  
        int c2 = m2[0].length;  
        int[][] res = new int[r1][c2];  
        mulMat(m1, m2, res);

        System.out.println("Multiplication of the given two matrices is:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res[i][j] + "\t");  
            }
            System.out.println();  
        }
    }
}
