package org.example;

import java.util.ArrayList;
import java.util.List;

// Test Commit 2
public class RemoveElement {
    public int removeElement(ArrayList<Integer> list, int k){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==k) {
                list.remove(i);
                i--;
            }
        }
        return list.size();
    }
}
