package org.example.Solutions;
import java.util.*;
public class DocumentGenaration {
    public boolean generateDocument(String characters, String document) {
        // Write your code here.
        HashMap<Character, Integer> characterCollection = new HashMap<>();

        for(int i=0 ; i<characters.length() ; i++){
            char letter = characters.charAt(i);
            if(characterCollection.containsKey(letter)){
                characterCollection.put(letter,characterCollection.get(letter)+1);
                continue;
            }
            characterCollection.put(letter,1);
        }

        for(int i=0; i<document.length(); i++){
            char letter = document.charAt(i);
            if(!characterCollection.containsKey(letter)){
                return false;
            }
            characterCollection.put(letter, characterCollection.get(letter)-1);
            if(characterCollection.get(letter)<0){
                return false;
            }
        }

        return true;
    }
}
