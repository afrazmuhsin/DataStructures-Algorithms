package org.example;

public class IsPalindrome {
    //Given an integer x, return true if x is palindrome, and false otherwise.
    //    Example 1:
    //
    //    Input: x = 121
    //    Output: true
    //    Explanation: 121 reads as 121 from left to right and from right to left.
    //            Example 2:
    //
    //    Input: x = -121
    //    Output: false
    //    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    //    Example 3:
    //
    //    Input: x = 10
    //    Output: false
    //    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    public boolean isPalindromeString(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=str.length()-1; i>= 0;i--){
            result.append(str.charAt(i));
        }
        return (str.contentEquals(result));
    }

    public boolean isPalindromeStringVariable(String str) {
       int i=0; int j=str.length()-1;
       while(i<j){
           if(str.charAt(i)!= str.charAt(j)) return false;
           else {
               i++ ;
               j--;
           }
       }
       return true;
    }

    public boolean isPalindromeInteger(Integer n){
        Integer reverseNum = 0;
        Integer inputValue = n;
        int i=0;
        while(n >0){
            i = n %10;
            reverseNum = reverseNum * 10 + i ;
            n = n/10;
        }
        return reverseNum.equals(inputValue);
    }
}
