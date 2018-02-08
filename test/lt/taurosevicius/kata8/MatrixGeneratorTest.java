package lt.taurosevicius.kata8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MatrixGeneratorTest {
    private MatrixGenerator matrix;

    @BeforeEach
    void setUp() {
        matrix = new MatrixGenerator();
    }

    @Test
    void generateMatrixOfSize0() {
        assertThrows(UnsupportedDimensionException.class, () -> matrix.generateMatrix(0));
    }

    @Test
    void generateMatrixOfSizeNegative1() {
        assertThrows(UnsupportedDimensionException.class, () -> matrix.generateMatrix(-1));
    }

    @Test
    void generateMatrixOfSize1() {
        int[][] expected = {{1}};
        assertTrue(Arrays.deepEquals(expected, matrix.generateMatrix(1)));
    }

    @Test
    void generateMatrixOfSize2() {
        int[][] expected = {{1, 3}, {2, 4}};
        int[][] actual = matrix.generateMatrix(2);

        assertTrue(Arrays.deepEquals(expected, actual));
    }

    @Test
    void generateMatrixOfSize3() {
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] actual = matrix.generateMatrix(3);

        assertTrue(Arrays.deepEquals(expected, actual));
    }
}