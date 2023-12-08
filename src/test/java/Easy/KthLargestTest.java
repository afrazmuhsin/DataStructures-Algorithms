package Easy;

import org.example.KthLargestNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class KthLargestTest {
    KthLargestNumber kth = new KthLargestNumber();

    @Test
    void kthLargestTest1(){
        Integer[] numList = new Integer[]{5,2,4,8,3,9,1};
        Integer i = kth.kthLargestMinHeap(numList,3);
        Assert.assertEquals(i,5);
    }
    @Test
    void kthLargestTest2(){
        Integer[] numList = new Integer[]{5};
        Integer i = kth.kthLargestMinHeap(numList,3);
        Assert.assertEquals(i,-1);
    }
    @Test
    void kthLargestTest3(){
        Integer[] numList = new Integer[]{32,2,4,8,3,92,65};
        Integer i = kth.kthLargestMinHeap(numList,1);
        Assert.assertEquals(i,92);
    }
    @Test
    void kthLargestTest4(){
        List<Integer> numList = Arrays.asList(5,2,4,8,3,9,1);
        Integer i = kth.kthLargestMaxHeap(numList,3);
        Assert.assertEquals(i,5);
    }
}
