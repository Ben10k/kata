package lt.taurosevicius.kata3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AccumulTest {

    @Test
    void accumNull() {
        assertNull(Accumul.accum(""));
    }

    @Test
    void accumUnrecogniziedChar() {
        assertNull(Accumul.accum("9"));
        assertNull(Accumul.accum("%dfg"));
    }


    @Test
    void accumSingleChar() {
        assertEquals("A", Accumul.accum("a"));
        assertEquals("A", Accumul.accum("A"));
    }

    @Test
    void accumDualChar() {
        assertEquals("A-Bb", Accumul.accum("ab"));
        assertEquals("A-Bb", Accumul.accum("AB"));
    }

    @Test
    void accumTripleChar() {
        assertEquals("A-Bb-Ccc", Accumul.accum("abC"));
        assertEquals("A-Bb-Ddd", Accumul.accum("ABd"));
    }

    // Provided tests

    @Test
    public void test() {
        assertEquals("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu", Accumul.accum("ZpglnRxqenU"));
        assertEquals("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb", Accumul.accum("NyffsGeyylB"));
        assertEquals("M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu", Accumul.accum("MjtkuBovqrU"));
        assertEquals("E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm", Accumul.accum("EvidjUnokmM"));
        assertEquals("H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc", Accumul.accum("HbideVbxncC"));
    }
}