/**
 * MatrixUtils provides static methods to perform matrix operations.
 * Specifically, it provides functionality to calculate the determinant of a square matrix.
 */
public class MatrixUtils {

    /**
     * This method calculates the determinant of a square matrix.
     *
     * @param mat The input square matrix (2D array).
     * @return The determinant of the matrix.
     */
    static double determinant(double[][] mat) {
        int n = mat.length;  
        return determinantOfMatrix(mat, n); 
    }

    /**
     * This method generates the cofactor (minor) matrix by excluding the specified row and column.
     *
     * @param mat The input matrix.
     * @param temp The temporary matrix to store the minor matrix.
     * @param p The row index to exclude.
     * @param q The column index to exclude.
     * @param n The current size of the matrix.
     */
    static void getCofactor(double mat[][], double temp[][], int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = mat[row][col];
                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    /**
     * This recursive method calculates the determinant of a matrix using cofactor expansion.
     *
     * @param mat The input matrix.
     * @param n The size of the matrix.
     * @return The determinant of the matrix.
     */
    static double determinantOfMatrix(double mat[][], int n) {
        double D = 0;  

        if (n == 1)
            return mat[0][0];

        double temp[][] = new double[n][n];  
        double sign = 1;  
        for (int f = 0; f < n; f++) {
            getCofactor(mat, temp, 0, f, n);
            D += sign * mat[0][f] * determinantOfMatrix(temp, n - 1);

            sign = -sign;
        }

        return D;  // Return the final computed determinant.
    }
}
