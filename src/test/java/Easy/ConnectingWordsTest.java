package Easy;

import org.example.ConnectingWords;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectingWordsTest {
    ConnectingWords cw = new ConnectingWords();

    @Test
    void testConnectingWordsTest1(){
        List<String> inputList = Arrays.asList("1p3acres", "is", "a", "good", "place", "for", "communicate");
        int maxLength = 12;
        List<String> result = cw.connectingWordsTest(inputList,maxLength);
        Assert.assertEquals(result,Arrays.asList("1p3acres-is", "a-good-place", "for", "communicate"));
    }

    @Test
    void testConnectingWordsTest2(){
        List<String> inputList = Arrays.asList("1p3acres123", "is", "a", "good", "place", "for", "communicate");
        int maxLength = 12;
        List<String> result = cw.connectingWordsTest(inputList,maxLength);
        Assert.assertEquals(result,Arrays.asList("1p3acres123", "is-a-good", "place-for", "communicate"));
    }

    @Test
    void testConnectingWordsTest3(){
        List<String> inputList = Arrays.asList("1p3acres123");
        int maxLength = 12;
        List<String> result = cw.connectingWordsTest(inputList,maxLength);
        Assert.assertEquals(result,Arrays.asList("1p3acres123"));
    }

    @Test
    void testConnectingWordsTest4(){
        List<String> inputList = new ArrayList<>();
        int maxLength = 12;
        List<String> result = cw.connectingWordsTest(inputList,maxLength);
        Assert.assertEquals(result,Arrays.asList(""));
    }
}
