package Easy;

import org.example.IsAnagram;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsAnagramTest {
    IsAnagram m = new IsAnagram();
    String str1 , str2 = "";
    @Test
    void testisAnagramTrue(){
        str1 = "lifie";
        str2 = "filie";
        boolean result = m.isAnagramTest(str1,str2);
        Assert.assertTrue(result);
    }

    @Test
    void testisAnagramMisMatchLength(){
        str1 = "lfi";
        str2 = "filie";
        boolean result = m.isAnagramTest(str1,str2);
        Assert.assertFalse(result);
    }

    @Test
    void testisAnagramFalse(){
        str1 = "lifir";
        str2 = "filie";
        boolean result = m.isAnagramTest(str1,str2);
        Assert.assertFalse(result);
    }
}
