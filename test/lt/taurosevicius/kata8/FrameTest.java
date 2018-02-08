package lt.taurosevicius.kata8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FrameTest {
    private Frame frame;

    @BeforeEach
    void setUp() {
        frame = new Frame(new MatrixGenerator());
    }

    @Test
    void invertMatrixOfSizeNegative() {
        assertThrows(UnsupportedDimensionException.class, () -> frame.invertArrayMiddle(-1));
    }


    @Test
    void invertMatrixEmpty() {
        assertThrows(UnsupportedDimensionException.class, () -> frame.invertArrayMiddle(0));
    }

    @Test
    void invertMatrixOf1() {
        int[][] expected = {{1}};
        int[][] actual = frame.invertArrayMiddle(1);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void invertMatrixOf2() {
        int[][] expected = {{1, 3}, {2, 4}};
        int[][] actual = frame.invertArrayMiddle(2);
        assertTrue(Arrays.deepEquals(actual, expected));
    }


    @Test
    void invertMatrixOf3() {
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] actual = frame.invertArrayMiddle(3);
        assertTrue(Arrays.deepEquals(actual, expected));
    }

    @Test
    void invertMatrixOf4() {
        int[][] expected = {{1, 5, 9, 13}, {2, 6, 7, 14}, {3, 10, 11, 15}, {4, 8, 12, 16}};
        int[][] actual = frame.invertArrayMiddle(4);
        assertTrue(Arrays.deepEquals(actual, expected));
    }
}