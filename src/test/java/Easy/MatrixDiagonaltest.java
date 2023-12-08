package Easy;

import org.example.MatrixDiagonal;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class MatrixDiagonaltest {
    MatrixDiagonal md = new MatrixDiagonal();

    @Test
    public void testDiagonal(){
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<List<Integer>>();
        list.add(11);
        list.add(2);
        list.add(4);
        list1.add(list);
        list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list1.add(list);
        list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(-12);
        list1.add(list);
        Assert.assertEquals(15,md.diagonalDifference(list1));
    }
}
