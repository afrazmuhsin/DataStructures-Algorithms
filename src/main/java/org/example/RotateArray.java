package org.example;

import java.util.*;

public class RotateArray {
    public ArrayDeque<Integer> rotateArray(Integer[] arr , int k){
        ArrayDeque<Integer> dq = new ArrayDeque<>(List.of(arr));
        for(int i=0;i<k;i++){
            Integer val = dq.removeLast();
            dq.addFirst(val);
        }
        return dq;
    }
}


