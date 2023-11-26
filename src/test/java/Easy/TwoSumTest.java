package Easy;

import org.example.TwoSum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSumTest {
    TwoSum toSum = new TwoSum();

    @Test
    void twoSumTrue(){
        Integer[] input = new Integer[]{2,7,11,15};
        Integer target = 26;
        Integer[] result = toSum.twoSumTest(input,target);
        Assert.assertEquals(new Integer[]{2,3},result);
    }

    @Test
    void twoSumInputWrong(){
        Integer[] input = new Integer[]{2};
        Integer target = 26;
        Integer[] result = toSum.twoSumTest(input,target);
        Assert.assertEquals(new Integer[]{},result);
    }

    @Test
    void twoSumFirstLast(){
        Integer[] input = new Integer[]{2,7,11,15};
        Integer target = 17;
        Integer[] result = toSum.twoSumTest(input,target);
        Assert.assertEquals(new Integer[]{0,3},result);
    }

    @Test
    void twoSumSecondLast(){
        Integer[] input = new Integer[]{2,7,11,15};
        Integer target = 22;
        Integer[] result = toSum.twoSumTest(input,target);
        Assert.assertEquals(new Integer[]{1,3},result);
    }
}
