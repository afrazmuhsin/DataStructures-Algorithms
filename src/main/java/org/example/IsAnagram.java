package org.example;

import java.util.HashMap;

public class IsAnagram {

    public boolean isAnagramTest(String str1 , String str2){
        if(str1.length()!= str2.length()){
            return false;
        }
        else{
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            HashMap<Character,Integer> map1 = new HashMap<>();
            HashMap<Character,Integer> map2 = new HashMap<>();
            updateMap(map1,a);
            updateMap(map2,b);
            return map1.equals(map2);
        }
    }

    void updateMap(HashMap<Character, Integer> map, char[] a){
        for(int i=0;i<a.length;i++){
            if(map.get(a[i]) == null){
                map.put(a[i],1);
            }
            else{
                Integer d = map.get(a[i]);
                map.put(a[i],++d);
            }
        }
    }
}
