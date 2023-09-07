package org.example.Solutions;
import java.util.*;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        for(int i=0,j=array.length-1; i!=j ;){
            int sum = array[i]+array[j];
            if(sum > targetSum){
                j--;
                continue;
            }
            else if(sum < targetSum){
                i++;
                continue;
            }
            int[] resultArray = {array[i],array[j]};
            return resultArray;
        }
        return new int[0];
    }
}

