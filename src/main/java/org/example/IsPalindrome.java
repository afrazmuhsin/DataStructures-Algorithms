package org.example;

public class IsPalindrome {
    public boolean isPalindromeString(String str) {
        StringBuilder result = new StringBuilder();
        for(int i=str.length()-1; i>= 0;i--){
            result.append(str.charAt(i));
        }
        return (str.contentEquals(result));
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
