package org.example.Solutions;
import java.util.*;
public class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {
        int [] array2 = new int[array.length];
        for(int i=0; i<array.length;i++){
            array2[i] = array[i]*array[i];
        }
        Arrays.sort(array2);
        return array2;
    }
}
