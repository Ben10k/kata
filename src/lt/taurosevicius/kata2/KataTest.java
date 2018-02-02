package lt.taurosevicius.kata2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    void singleCharTests() {
        assertEquals("a", Kata.getMiddle("a"));
        assertEquals("I", Kata.getMiddle("I"));
    }

    @Test
    void dualCharTests() {
        assertEquals("an", Kata.getMiddle("an"));
        assertEquals("or", Kata.getMiddle("or"));
    }

    @Test
    void unevenTest() {
        assertEquals("b", Kata.getMiddle("abc"));
        assertEquals("c", Kata.getMiddle("abcde"));

    }

    @Test
    void evenTest() {
        assertEquals("bc", Kata.getMiddle("abcd"));
        assertEquals("cd", Kata.getMiddle("abcdef"));

    }
}