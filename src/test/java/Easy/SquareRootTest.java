package Easy;

import org.example.SquareRoot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareRootTest {
    SquareRoot sqrt = new SquareRoot();

    @Test
    void testSqrt(){
        int result = sqrt.squareRoot(36);
        Assert.assertEquals(6,result);
    }
    @Test
    void testSqrt1(){
        int result = sqrt.squareRoot(110);
        Assert.assertEquals(10,result);
    }
    @Test
    void testSqrt2(){
        int result = sqrt.squareRoot(23);
        Assert.assertEquals(4,result);
    }

    @Test
    void testSqrt3(){
        int result = sqrt.sqrtLinear(26);
        Assert.assertEquals(5,result);
    }


    // Low = 1 High = n mid = l=h/2
    // mid * mid <=n or mid * mid > n

    // l = 1 ;  high = mid-1 m=l+h/2
    //l = mid + 1 ; h = n
}
