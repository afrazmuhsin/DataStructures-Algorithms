package Easy;

import org.example.ValidExpressions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidExpressionTest {

    ValidExpressions v = new ValidExpressions();
    @Test
    public void validExpressionTest(){
        String str = "{}()[]";
        Assert.assertTrue(v.validExpressionTest(str));
    }

    @Test
    public void invalidExpressionTest(){
        String str = "{(})[]";
        Assert.assertFalse(v.validExpressionTest(str));
    }
}
