package org.example;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedList {

    public List<Integer> mergeSortedList(List<Integer> listA, List<Integer> listB) {
        List<Integer> listC = new ArrayList<>();
        int i=0,j=0;
        if((listA.isEmpty()) && (listB.size()>0)) return listB;
        if((listA.size()>0) && (listB.isEmpty())) return listA;
        if((listA.isEmpty()) && (listB.isEmpty())) return listC;
        while ((i<listA.size()) || (j< listB.size())){
            if((listA.get(i))==(listB.get(j))){
                listC.add(listA.get(i));
                listC.add(listB.get(j));
                i++;
                j++;
            }
            else if((listA.get(i))<(listB.get(j))){
                listC.add(listA.get(i));
                i++;
            }
            else {
                listC.add(listB.get(j));
                j++;
            }

        }
        return listC;
    }
}
