import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MatrixMultiplicationTest {
    @Test
    public void testMatrixMultiplicationValid() {
        int[][] m1 = {
            {1, 2},
            {3, 4}
        };
        
        int[][] m2 = {
            {5, 6},
            {7, 8}
        };
        
        int[][] expected = {
            {19, 22},
            {43, 50}
        };
    
        int r1 = m1.length;
        int c2 = m2[0].length;
        int[][] res = new int[r1][c2];  
        
        MatrixMultiplication.mulMat(m1, m2, res);
    
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                assertEquals(expected[i][j], res[i][j]);
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
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Matrices cannot be multiplied due to incompatible dimensions.");
        }
    }
}    