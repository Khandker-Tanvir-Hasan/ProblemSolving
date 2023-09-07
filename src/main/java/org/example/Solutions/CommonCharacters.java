package org.example.Solutions;
import java.util.*;
public class CommonCharacters {
    public String[] commonCharacters(String[] strings) {
        HashSet<String> finalSet = new HashSet<>();
        for(int i=0; i<strings[0].length(); i++){
            finalSet.add(""+strings[0].charAt(i));
        }
        for(int i=1; i<strings.length; i++){
            HashSet<String> currentSet = new HashSet<>();
            for(int j=0;j<strings[i].length(); j++){
                currentSet.add(""+strings[i].charAt(j));
            }
            finalSet.retainAll(currentSet);
        }
        String [] output = finalSet.toArray(new String[finalSet.size()]);
        return output;
    }
}
