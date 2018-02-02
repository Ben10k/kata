package lt.taurosevicius.kata1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DinglemouseTest {

    @Test
    void humanYearsCatYearsDogYears0Test2() {
        assertArrayEquals(null, Dinglemouse.humanYearsCatYearsDogYears(0));
    }

    @Test
    void humanYearsCatYearsDogYears0Test33() {
        assertArrayEquals(new int[]{}, Dinglemouse.humanYearsCatYearsDogYears(0));
    }

    @Test
    void humanYearsCatYearsDogYears0Test() {
        assertArrayEquals(new int[]{0, 0, 0}, Dinglemouse.humanYearsCatYearsDogYears(0));
    }


    @Test
    void humanYearsCatYearsDogYears1Test() {
        assertArrayEquals(new int[]{1, 15, 15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    }

    @Test
    void humanYearsCatYearsDogYears2Test() {
        assertArrayEquals(new int[]{2, 24, 24}, Dinglemouse.humanYearsCatYearsDogYears(2));
    }

    @Test
    void humanYearsCatYearsDogYears3Test() {
        assertArrayEquals(new int[]{3, 28, 29}, Dinglemouse.humanYearsCatYearsDogYears(3));
    }

    @Test
    void humanYearsCatYearsDogYears4Test() {
        assertArrayEquals(new int[]{4, 32, 34}, Dinglemouse.humanYearsCatYearsDogYears(4));
    }

    @Test
    void humanYearsCatYearsDogYears10Test() {
        assertArrayEquals(new int[]{10, 56, 64}, Dinglemouse.humanYearsCatYearsDogYears(10));
    }


}