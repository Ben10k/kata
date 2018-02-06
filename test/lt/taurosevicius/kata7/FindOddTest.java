package lt.taurosevicius.kata7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FindOddTest {

    @Test
    void nullTest() {
        assertThrows(NullPointerException.class, () -> FindOdd.findIt(null));
    }


    @Test
    void noOdd() {
        assertThrows(FindOdd.NoValueRepeatedOddNumberOfTimesException.class,
                () -> FindOdd.findIt(new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    void multipleOdd() {
        assertThrows(FindOdd.MoreThanOneValueRepeatedOddNumberOfTimesException.class,
                () -> FindOdd.findIt(new int[]{1, 2, 3, 1, 2, 3, 1, 2}));
    }

    @Test
    void oneOdd() {
        assertEquals(3, FindOdd.findIt(new int[]{1, 2, 3, 2, 1}));
    }


    // Provided test
    @Test
    void findTest() {
        assertEquals(5, FindOdd.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}));
        assertEquals(-1, FindOdd.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        assertEquals(5, FindOdd.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        assertEquals(10, FindOdd.findIt(new int[]{10}));
        assertEquals(10, FindOdd.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        assertEquals(1, FindOdd.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }

}