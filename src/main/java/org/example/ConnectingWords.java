package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectingWords {

//    Input: String[] words, int maxLength.
//    Output: List lines.
//    e.g. ["1p3acres", "is", "a", "good", "place", "to", "communicate"], 12 =>
//                                {"1p3acres-is", "a-good-place", "for", "communicate"}

    public List<String> connectingWordsTest(List<String> inputList,int maxLength){
            List<String> result = new ArrayList<String>() ;
            String str = "";
            if(!inputList.isEmpty()) { str = inputList.get(0);}
            for(int i=1;i<inputList.size();i++){
                if(str.length() + inputList.get(i).length() <= maxLength-1){
                    str = str.isEmpty()? inputList.get(i): str + '-' + inputList.get(i);
                }
                else {
                    result.add(str);
                    str = "";
                    i--;
                }
            }
            result.add(str);
            return result;
        }
}
