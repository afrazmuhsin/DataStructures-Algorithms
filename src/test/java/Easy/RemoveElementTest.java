package Easy;

import org.example.RemoveElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementTest {
    RemoveElement m = new RemoveElement();

    @Test
    void testRemoveElementTest1(){
        Assert.assertEquals(2,m.removeElement(new ArrayList<Integer>(Arrays.asList(2,2,3,3)),2));
    }

    @Test
    void testRemoveElementTest2(){
        Assert.assertEquals(5,m.removeElement(new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,0,4,2)),2));
    }
}
