package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Sudoko {

    public boolean isSudoko(int[][] grid1) {
        HashSet<Integer> sudoko = new HashSet<>();
        //Checking Row
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                if ((!sudoko.add(grid1[i][j])) || !(grid1[i][j] > 0 && grid1[i][j] <= 9)) {
                    return false;
                }
            }
            sudoko = new HashSet<>();
        }

        //Checking Column
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                if ((!sudoko.add(grid1[j][i])) || !(grid1[j][i] > 0 && grid1[j][i] <= 9)) {
                    return false;
                }
            }
            sudoko = new HashSet<>();
        }
        return true;
    }
}