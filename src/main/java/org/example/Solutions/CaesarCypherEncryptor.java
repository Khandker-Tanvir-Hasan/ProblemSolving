package org.example.Solutions;
import java.util.*;
public class CaesarCypherEncryptor {
    public static String caesarCypherEncryptor(String str, int key) {
        String s = "";
        int startBound ='a'+0;
        int endBound = 'z'+0;
        for(int i=0; i<str.length();i++){
            int charInt = str.charAt(i)+key;
            s = s+(char)((charInt>=endBound+1)?((charInt%(endBound+1))%26)+startBound:charInt);
        }
        return s;
    }
}
