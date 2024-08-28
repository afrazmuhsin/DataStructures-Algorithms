package Easy;

import org.example.Fibinocci;
import org.testng.Assert;
import org.testng.annotations.Test;

//Fib Tests
public class FibinocciTest {

    Fibinocci sk = new Fibinocci();
    @Test
    public void fibTest1(){
        Assert.assertEquals(5,sk.fib(4));
        Assert.assertEquals(34,sk.fib(8));
        Assert.assertEquals(13,sk.fib(6));
        Assert.assertEquals(21,sk.fib(7));
    }
}
