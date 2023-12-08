package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class Sudoko {

    public boolean isSudoko(int[][] grid1) {
        HashSet<Integer> sudokoRow = new HashSet<>();
        HashSet<Integer> sudokoColumn = new HashSet<>();

        //Checking Row
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                if ((!sudokoRow.add(grid1[i][j])) || !(grid1[i][j] > 0 && grid1[i][j] <= 9)) {
                    return false;
                }
                if ((!sudokoColumn.add(grid1[j][i])) || !(grid1[j][i] > 0 && grid1[j][i] <= 9)) {
                    return false;
                }
            }
            sudokoRow = new HashSet<>();
            sudokoColumn = new HashSet<>();
        }
        return true;
    }
}