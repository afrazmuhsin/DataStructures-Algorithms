package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    //    Write a function to find the longest common prefix string amongst an array of strings.
//
//    If there is no common prefix, return an empty string "".
//
//
//
//    Example 1:
//
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//    Example 2:
//
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.

    public String longestCommonPrefix(String[] s) {
        String longestPrefix = "";
        String temp="";
        for(int i=1;i<s.length;i++){
            temp = commonPrefix(s[i],s[i-1]);
            if(longestPrefix.isEmpty() && temp.isEmpty()) return "";
            else if((longestPrefix.length()> temp.length()) || (longestPrefix.isEmpty())){
                longestPrefix = temp;
            }
        }
        return longestPrefix;
    }

    public String commonPrefix(String str1 , String str2){
        StringBuilder commonPrefix = new StringBuilder("");
        String shortString = (str1.length()<str2.length())? str1: str2;
        String longString = (str1.length()>str2.length())? str1: str2;
        for(int i =0 ;i< shortString.length();i++){
            if(shortString.charAt(i)==longString.charAt(i)) {
                commonPrefix.append(shortString.charAt(i));
            }
            else{
                return commonPrefix.toString();
            }
        }
        return commonPrefix.toString();
    }
}
