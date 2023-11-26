package Easy;

import org.example.IsPalindrome;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {
    ///
    IsPalindrome m = new IsPalindrome();
    @Test
    void palindromeTrue() {
        String str = "MalayalaM";
        boolean result = m.isPalindromeString(str);
        Assert.assertTrue(result);
    }

    @Test
    void palindromeFail() {
        String str = "Lowes";
        boolean result = m.isPalindromeString(str);
        Assert.assertFalse(result);
    }

    @Test
    void palindromeNumberFalse() {
        Integer num = 351;
        boolean result = m.isPalindromeInteger(num);
        Assert.assertFalse(result);
    }

    @Test
    void palindromeNumberTrue() {
        Integer num = 3553;
        boolean result = m.isPalindromeInteger(num);
        Assert.assertTrue(result);
    }
}
