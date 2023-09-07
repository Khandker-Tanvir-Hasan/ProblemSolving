package org.example.Solutions;
import java.util.*;
public class FirstNonRepeatingCharacter {
    public int firstNonRepeatingCharacter(String string) {
        HashMap<Character,Integer> repeatation = new HashMap<>();
        for(int i=0; i<string.length(); i++){
            char c = string.charAt(i);
            repeatation.put(c, repeatation.containsKey(c)? repeatation.get(c)+1:1);
        }
        for(int i=0; i<string.length(); i++){
            if(repeatation.get(string.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
