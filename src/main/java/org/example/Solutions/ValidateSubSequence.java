package org.example.Solutions;
import java.util.*;

public class ValidateSubSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
        for(int i=0,j=0; i<array.size(); i++){
            j = array.get(i) == sequence.get(j)? j+1:j;
            if(j == sequence.size()){return true;}
        }
        return false;
    }
}