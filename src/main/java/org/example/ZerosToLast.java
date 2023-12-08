package org.example;

import java.util.ArrayList;
import java.util.List;

public class ZerosToLast {
    public Integer[] zeroToLast(Integer[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, j, i);
                j++;
            }
        }
        return arr;
    }

    public void swap(Integer[] arr, int index_one , int index_two){
        Integer tempValue = arr[index_one];
        arr[index_one] = arr[index_two];
        arr[index_two] = tempValue;
    }
}
