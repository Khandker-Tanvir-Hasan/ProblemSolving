package org.example.Solutions;
import java.util.*;
public class FirstDuplicateValue {
    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        for(int i=0; i<array.length; i++){
            int number = Math.abs(array[i]);
            if(array[number-1]<0){
                return number;
            }
            array[number-1] = array[number-1]*-1;
        }
        return -1;
    }
}
