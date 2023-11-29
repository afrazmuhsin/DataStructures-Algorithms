package Easy;

import org.example.MergeSortedList;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class MergeSortedListTest {
    MergeSortedList msl = new MergeSortedList();

    @Test
    void mergeSortedListTest1() {
        List<Integer> listA = Arrays.asList(1,2,4);
        List<Integer> listB = Arrays.asList(1,3,4);
        List<Integer> result = msl.mergeSortedList(listA,listB);
        Assert.assertEquals(Arrays.asList(1,1,2,3,4,4),result);
    }

    @Test
    void mergeSortedListTest2() {
        List<Integer> listA = Arrays.asList();
        List<Integer> listB = Arrays.asList();
        List<Integer> result = msl.mergeSortedList(listA,listB);
        Assert.assertEquals(Arrays.asList(),result);
    }

    @Test
    void mergeSortedListTest3() {
        List<Integer> listA = Arrays.asList();
        List<Integer> listB = Arrays.asList(0);
        List<Integer> result = msl.mergeSortedList(listA,listB);
        Assert.assertEquals(Arrays.asList(0),result);
    }
}
