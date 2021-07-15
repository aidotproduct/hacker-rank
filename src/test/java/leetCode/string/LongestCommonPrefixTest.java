package leetCode.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix lgp = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {
        String[] strs = new String[] {"flower","flow","flight"};
        String value = lgp.longestCommonPrefix(strs);
        assertEquals("fl", value);
    }

    @Test
    void longestCommonPrefix1() {
        String[] strs = new String[] {"dog","racecar","car"};
        String value = lgp.longestCommonPrefix(strs);
        assertEquals("", value);
    }

    @Test
    void longestCommonPrefix2() {
        String[] strs = new String[] {"exxboy","exxwife","exxuberant"};
        String value = lgp.longestCommonPrefix(strs);
        assertEquals("exx", value);
    }
}