package Easy;

import org.example.RotateArray;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayDeque;

public class RotateArrayTest {
    RotateArray ra = new RotateArray();

    @Test
    void rotateArrayTest1() {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7};
        ArrayDeque<Integer> ard = ra.rotateArray(arr,3);
        Assert.assertEquals(new Integer[]{5,6,7,1,2,3,4},ard.toArray());
    }
}