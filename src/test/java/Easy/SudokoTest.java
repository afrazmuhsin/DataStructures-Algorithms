package Easy;

import org.example.Sudoko;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SudokoTest {
    Sudoko sk = new Sudoko();

    @Test
    public void sudoTest(){
        int[][] grid1 = {{1,2,3},{3,1,2},{2,3,1}};
        Assert.assertTrue(sk.isSudoko(grid1));
    }

    @Test
    public void sudoTest1(){
        int[][] grid1 = {{1,2,3},{3,1,2},{2,3,0}};
        Assert.assertFalse(sk.isSudoko(grid1));
    }

    @Test
    public void sudoTest2(){
        int[][] grid1 = {{1,2,3},{1,2,3},{1,2,3}};
        Assert.assertFalse(sk.isSudoko(grid1));
    }
}
