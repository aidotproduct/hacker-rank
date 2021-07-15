package leetCode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {

    @Test
    void countAndSay() {
        CountAndSay countAndSay = new CountAndSay();
        String value = countAndSay.countAndSay(1);
        assertEquals("1", value);
    }

    @Test
    void countAndSay2() {
        CountAndSay countAndSay = new CountAndSay();
        String value = countAndSay.countAndSay(2);
        assertEquals("11", value);
    }

    @Test
    void countAndSay3() {
        CountAndSay countAndSay = new CountAndSay();
        String value = countAndSay.countAndSay(3);
        assertEquals("21", value);
    }

    @Test
    void countAndSay4() {
        CountAndSay countAndSay = new CountAndSay();
        String value = countAndSay.countAndSay(4);
        assertEquals("1211", value);
    }

    @Test
    void countAndSay5() {
        CountAndSay countAndSay = new CountAndSay();
        String value = countAndSay.countAndSay(5);
        assertEquals("111221", value);
    }

    @Test
    void countAndSay6() {
        CountAndSay countAndSay = new CountAndSay();
        String value = countAndSay.countAndSay(6);
        assertEquals("312211", value);
    }
}