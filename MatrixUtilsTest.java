import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixUtilsTest {

    @Test
    public void testDeterminant2x2Matrix() {
        double[][] matrix = {{5, 6}, {7, 8}};
        double result = MatrixUtils.determinant(matrix);
        assertEquals("Determinant of 2x2 matrix", -2.0, result, 0.001);
    }

    @Test
    public void testDeterminant3x3Matrix() {
        double[][] matrix = {{2, 5, 8}, {1, 3, 4}, {7, 6, 9}};
        double result = MatrixUtils.determinant(matrix);
        assertEquals("Determinant of 3x3 matrix", 12.0, result, 0.001);
    }

    @Test
    public void testDeterminant4x4Matrix() {
        double[][] matrix = {{3, 2, 1, 4}, {0, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
        double result = MatrixUtils.determinant(matrix);
        assertEquals("Determinant of 4x4 matrix", -204.0, result, 0.001);
    }
}
