import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixMultiplicationTest {

    @Test
    public void testMatrixMultiplicationValid() {
        int[][] m1 = {
            {2, 3},
            {4, 5}
        };
        
        int[][] m2 = {
            {6, 7},
            {8, 9}
        };
        
        int[][] expected = {
            {42, 48},
            {64, 74}
        };

        int r1 = m1.length;
        int c2 = m2[0].length;
        int[][] res = new int[r1][c2]; 
        
        MatrixMultiplication.mulMat(m1, m2, res);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                assertEquals("Matrix multiplication result is incorrect", expected[i][j], res[i][j]);
            }
        }
    }

    @Test
    public void testMatrixMultiplicationInvalid() {
        int[][] m1 = {
            {2, 3},
            {4, 5}
        };

        int[][] m2 = {
            {1, 2}
        };

        int r1 = m1.length;
        int c2 = m2[0].length;
        int[][] res = new int[r1][c2]; 
        
        try {
            MatrixMultiplication.mulMat(m1, m2, res);
            fail("Expected IllegalArgumentException due to incompatible matrices");
        } catch (Exception e) {
            assertTrue(e instanceof ArrayIndexOutOfBoundsException);
        }
    }
}
