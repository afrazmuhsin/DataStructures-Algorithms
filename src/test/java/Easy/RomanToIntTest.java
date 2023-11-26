package Easy;

import org.example.IsPalindrome;
import org.example.RomanToInt;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RomanToIntTest {

    RomanToInt m = new RomanToInt();
    @Test
    void romanToIntTest1() {
        String str = "III";
        Assert.assertEquals(m.romanToInt(str),3);
    }
    @Test
    void romanToIntTest2() {
        String str = "LVIII";
        Assert.assertEquals(m.romanToInt(str),58);
    }
    @Test
    void romanToIntTest3() {
        String str = "MCMXCIV";
        Assert.assertEquals(m.romanToInt(str),1994);
    }
}
