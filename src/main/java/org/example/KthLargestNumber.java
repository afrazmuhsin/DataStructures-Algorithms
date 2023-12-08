package org.example;

import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestNumber {
    public Integer kthLargestMinHeap(Integer[] numList, int k) {
        if (numList.length < k) return -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer each : numList) {
            pq.add(each);
        }
        while (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }

    public Integer kthLargestMaxHeap(List<Integer> numList, int k) {
        if (numList.size() < k) return -1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(numList);
        int count = 0;
        while (pq.size() > k) {
            count+=1;
            if(count==k) return pq.peek();
            pq.poll();
        }
        return -1;
    }
}
