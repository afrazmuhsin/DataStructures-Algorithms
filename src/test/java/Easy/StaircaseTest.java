package Easy;

import org.example.Staircase;
import org.testng.annotations.Test;

public class StaircaseTest {

    Staircase st = new Staircase();

    @Test
    public void stairTest(){
        st.staircase(4);
    }
}
