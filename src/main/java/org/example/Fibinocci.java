package org.example;

public class Fibinocci {
    public int fib(int n){
        int curr =1;int prev=0;int sum = 0;
        for(int i=0;i<n;i++){
            sum = curr + prev;
            prev=curr;
            curr = sum;
        }
        return sum;
    }
//    public int staircase(int n){
//        int dp[] = new int[n + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//
//        for (int i = 2; i <= n; i++)
//            dp[i] = dp[i - 1] + dp[i - 2];
//        return dp[n];
//    }
}
