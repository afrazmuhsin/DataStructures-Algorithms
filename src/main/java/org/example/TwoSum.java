package org.example;

import java.sql.Array;

public class TwoSum {

    public Integer[] twoSumTest(Integer[] input , Integer target) {
        if(input.length<2) return new Integer[]{};
        for(int i=0 ; i < input.length-1;i++){
            if(input[i] + input[i+1]==target){
                return new Integer[]{i,i+1};
            }
            if(input[i] + input[input.length-1] == target){
                return new Integer[]{i, input.length-1};
            }
        }
        return new Integer[]{};
    }
}
