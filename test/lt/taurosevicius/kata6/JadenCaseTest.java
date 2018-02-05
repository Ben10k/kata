package lt.taurosevicius.kata6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JadenCaseTest {
    private JadenCase jadenCase;


    @BeforeEach
    void setUp() {
        jadenCase = new JadenCase();

    }

    @Test
    void argNullReturnNullTest() {
        assertEquals(null, jadenCase.toJadenCase(null));
    }

    @Test
    void argEmptyReturnNullTest() {
        assertEquals(null, jadenCase.toJadenCase(""));
    }

    @Test
    void inputJadenCaseTest() {
        String expected = "How Can Mirrors Be Real If Our Eyes Aren't Real";
        assertEquals(expected, jadenCase.toJadenCase("How Can Mirrors Be Real If Our Eyes Aren't Real"));
    }

    @Test
    void oneWordInJadenTestCase() {
        String expected = "How";
        assertEquals(expected, jadenCase.toJadenCase("How"));
    }

    @Test
    void oneWordNotInJadenTestCase() {
        String expected = "How";
        assertEquals(expected, jadenCase.toJadenCase("how"));
    }

    @Test
    void twoWordsInJadenTestCase() {
        String expected = "How Can";
        assertEquals(expected, jadenCase.toJadenCase("How Can"));
    }

    @Test
    void twoWordsNotInJadenTestCase() {
        String expected = "How Can";
        assertEquals(expected, jadenCase.toJadenCase("How can"));
    }

    @Test
    void inputNotJadenCaseTest() {
        String expected = "How Can Mirrors Be Real If Our Eyes Aren't Real";
        assertEquals(expected, jadenCase.toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    @Test
    void onlyOneLetterWordTest() {
        String expected = "I O U";
        assertEquals(expected, jadenCase.toJadenCase("i o u"));
    }

    @Test
    void noLettersOnlyNumbersTest() {
        String expected = "123 457 896 01254 555547";
        assertEquals(expected, jadenCase.toJadenCase("123 457 896 01254 555547"));
    }

    @Test
    void randomCaseInputTest() {
        String expected = "How Can Mirrors Be Real If Our Eyes Aren't Real";
        assertEquals(expected, jadenCase.toJadenCase("How CAN mIrrors be reAl iF oUR eYES areN't reaL"));
    }
}