package Easy;

import org.example.ZerosToLast;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZerosTotLastTest {
    ZerosToLast z = new ZerosToLast();

    @Test
    public void testZeroLast(){
        Assert.assertEquals(z.zeroToLast(new Integer[]{1,2,0,4,3,0,5,0}),new Integer[]{1,2,4,3,5,0,0,0});
    }

    @Test
    public void testZeroLast1(){
        Assert.assertEquals(z.zeroToLast(new Integer[]{0,0,0,4,3,5,0}),new Integer[]{4,3,5,0,0,0,0});
    }
}
