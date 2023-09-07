package org.example.Solutions;
import java.util.*;
public class RunLengthEncoding {
    public String runLengthEncoding(String string) {
        // Write your code here.
        char c = string.charAt(0);
        int count = 1;
        String result = "";

        for(int i=1; i<string.length(); i++){
            char k = string.charAt(i);
            if(c == k){
                count++;
                if(count==9){
                    result=result+count+c;
                    count=0;
                }
            }
            else{
                if(count!=0){
                    result = result+ count+c;
                }
                c = k;
                count=1;
            }
        }
        char lastChar = string.charAt(string.length()-1);
        if(lastChar==c){
            result = result + count +c;
        }
        else{
            result = result + count + lastChar;
        }

        return result;
    }
}
