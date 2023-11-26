package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] s) {
        String longestPrefix = "";
        for(int i=1;i<s.length;i++){
            longestPrefix = commonprefix(s[i],s[i-1]);
        }
        return longestPrefix;
    }

    public String commonprefix(String str1 , String str2){
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
