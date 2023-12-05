package org.example;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class SquareRoot {

    public int squareRoot(int n){
        int low=1 ; int high = n; int mid,ans = 0;
        while(low<=high){
            mid = (low + high)/2;
            if(mid * mid <= n){
                ans = mid;
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }

    public int sqrtLinear(int n){
        //input 25 --> output 5
        //input 26 --> output 5
        //input 24 --> output 4

        for(int i=1;i<n/2;i++){
            if(i*i==n) return i;
            else if(i*i > n) return i-1;
        }
        return -1;
    }
}
