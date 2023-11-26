package Easy;

import org.example.IsPalindrome;
import org.example.LongestCommonPrefix;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Array;

public class LongestCommonPrefixTest {

    LongestCommonPrefix m = new LongestCommonPrefix();
    @Test
    void longestCommonPrefixTest1() {
        String[] str = {"Flower","Flow","Flight"};
        String result = m.longestCommonPrefix(str);
        Assert.assertEquals(result,"Fl");
    }
    @Test
    void longestCommonPrefixTest2() {
        String[] str = {"dog","racecar","car"};
        String result = m.longestCommonPrefix(str);
        Assert.assertEquals(result,"");
    }
}
